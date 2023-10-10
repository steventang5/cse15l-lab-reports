import java.io.IOException;
import java.net.URI;
import java.util.List;     
import java.util.ArrayList;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    List<String> list = new ArrayList<>();

    public String handleRequest(URI url) {
        List<String> search = new ArrayList<>();

        if (url.getPath().equals("/")) {
            String resultList = "[";
            for(int i = 0; i < list.size() - 1; i++){
                resultList += list.get(i) + ", ";
            }
            if(list.size() > 0){
                resultList += list.get(list.size() - 1);
            }
            resultList += "]";
            return resultList;
        } else if (url.getPath().equals("/search")) {
            String[] parameters = url.getQuery().split("=");
            if (parameters[0].equals("s")) {
                for(int i = 0; i < list.size(); i++){
                    if(list.get(i).contains(parameters[1])){
                        search.add(list.get(i));
                    }
                }
            }
            String result = "[";
            for(int i = 0; i < search.size() - 1; i++){
                result += search.get(i) + ", ";
            }
            if(search.size() > 0){
                result += list.get(list.size() - 1);
            }
            result += "]";
            if(search.size() == 0){
                result = "Substring not found in list";
            }
            return result;
        } else {
            if (url.getPath().contains("/add")) {
                String[] parameters = url.getQuery().split("=");
                if (parameters[0].equals("s")) {
                    list.add(parameters[1]);
                    return String.format("%s added to list!", parameters[parameters.length - 1]);
                }
            }
            return "404 Not Found!";
        }
    }
}

class SearchEngine {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
