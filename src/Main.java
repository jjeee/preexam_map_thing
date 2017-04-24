import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException{
        ArtistMap artists = new ArtistMap("p7artists.txt");
        Scanner input=new Scanner(System.in);
        int idChoice;

        do {
            System.out.println("Please enter ID ==> ");
            idChoice=input.nextInt();
            switch (idChoice) {
                case 1:case 2:case 3:case 4:case 5:case 6:case 7:case 8:case 9:case 10:case 11:
                case 12:case 13:case 14:case 15:case 16:case 17:case 18:case 19:case 20:
                    System.out.println("Name: " + artists.retrieveName(idChoice));
                    break;
                case 0:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Name not found!");
            }
        }while (idChoice!=0);
    }
}

class ArtistMap{
    public Map<Integer,String> map= new TreeMap<Integer,String>();
    Scanner inputFile;

    public ArtistMap(String file) throws IOException{
        inputFile=new Scanner(new File(file));
        inputFile.useDelimiter("\t|\r\n");
        while (inputFile.hasNext()){
            int id=inputFile.nextInt();
            String name=inputFile.next();

            map.put(id,name);
        }
    }

    public String retrieveName(int id){
        String name=map.get(id);
        return name;
    }
}
