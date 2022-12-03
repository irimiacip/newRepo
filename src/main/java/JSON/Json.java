package JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;



/*generam si citim dinamic un JSON
* Se adauga in pom.xml dependinta  <groupId>com.googlecode.json-simple</groupId>
* astefel putem apela obiectele JSONOBJECT si JSONARRAY*/

public class Json {

    public static void createJsonFile() throws  IOException {
        JSONObject objJson = new JSONObject();
        objJson.put("name", "Hagi");
        objJson.put("location", "Romania");
        JSONArray list = new JSONArray();
        list.add("Steua");
        list.add("Sporntul");
        list.add("Romania");
        objJson.put("echipe", list);

        try (FileWriter file = new FileWriter("C:\\TestGenerateFiles\\test.json")) {
            file.write(objJson.toString());
            file.flush();
        } catch (IOException e) {
            System.out.println("Afiseaza eroare " + e.getMessage());
        }
        System.out.println("afiseaza obiectul creat" + objJson);
    }

    public static void readJsonFile(){
        JSONParser parser = new JSONParser();

        try{
            Object obj = parser.parse(new FileReader("C:\\TestGenerateFiles\\test.json"));
            JSONObject jsonObject = (JSONObject) obj;
            String name = (String) jsonObject.get("name");
            System.out.println("Name is " + name);
            String location = (String) jsonObject.get("location");
            System.out.println("Location is " + location);
            // parcurgem colectia de data -- echipe --
           org.json.simple.JSONArray echipeArray = (org.json.simple.JSONArray) jsonObject.get("echipe");
            Iterator<String> echipe = (Iterator<String>) echipeArray.iterator();
             while(echipe.hasNext()){
                 System.out.println("Echipele unde a jucat : " + echipe.next());
             }

        }catch(FileNotFoundException e) {e.printStackTrace();}
        catch(IOException e) {e.printStackTrace();}
        catch(ParseException e) {e.printStackTrace();}
        catch(Exception e) {e.printStackTrace();}

    }

    public static void main(String args[]) throws  IOException {
createJsonFile();
readJsonFile();
    }
}
