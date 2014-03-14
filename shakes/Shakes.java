/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shakes;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.util.Map;
import java.util.HashMap; 
import java.util.Set; 
import java.util.TreeSet; 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Formatter;


public class Shakes {

  
    private Map<String, Integer> mine;
  public void openfile() throws IOException{
      
      
      
      FileInputStream fis;
      try {
          File file= new File("E:\\searching.txt");// object of file to be read
          fis = new FileInputStream(file); //file object to read put into the stream as an input file 
          DataInputStream dis;
          try (BufferedInputStream bis = new BufferedInputStream(fis)) {
              dis = new DataInputStream(bis);
              work(dis);
              fis.close();
          }
          dis.close();
      } catch (FileNotFoundException ex) {
       System.err.println("Error opening file");
       System.exit(1);
       
      }
      
  }
      public void work(DataInputStream dis){
      try {
          
            Formatter output=new Formatter();
          while(dis.available()!=0){  
              String s=dis.readLine();   // reads each line one by one
              String[] parts=s.split(" "); // splits each line into tokens, i.e words
               mine=new HashMap<>();
              for(String string : parts){
                  String word = string.toLowerCase();
                  if(mine.containsKey(word)){
                      int count=mine.get(word);  //gets the count of each encountered word
                      mine.put(word, count+1); //increments the count of each previously word and puts it 
                                               //back into the hashmap 
                  }
                  else
                       mine.put(word, 1);  //puts back each word that is not previously 
                                           //encountered into the map and appends a count of ne to it
                  
                                      
              }
                           
          }
          
          play(mine,output);
          
      } catch (IOException ex) {
          System.err.println("Error in processing");
      }
         
      
      }
      
        //displays each member of the map
    public void play(Map<String,Integer> out,Formatter output) throws IOException{
         
        output = new Formatter("E:\\searched.txt");
              
        Set<String> keys=out.keySet(); // all members of the map in this set so there is no repeatiton of words
        TreeSet<String> sort= new TreeSet<>(keys);// the set is put in this tree were it is sorted alphabetically
        System.out.printf("\nMap Contain:\nKey\t\tValue\n");//outputs to the file searched.txt
        for(String yes: sort){
            System.out.printf("%-10s%10s\n",yes,out.get(yes));
            System.out.println("\n");
        }
        System.out.printf("\nsize:    %d\nisEmpty:    %b\n",  mine.size() ,  mine.isEmpty() );
        
        //output formatter has to be closed to complet the copy
        output.close();
        
        //printing a prompt to the user about the success of the operation
        System.out.println("Result succesfully copied to file");
    }
}
