package ReadFIleAssignment;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileTransformation {

	
public static void main(String[] args) {
		
		
FileTransformation obj= new FileTransformation();
	
	System.out.println(obj.fileTransform());
	
	
}

          public Map<String,Integer> fileTransform()
          
         {
                	
	         String filePath = "MyTextFile";
             String fileContent = null;
             
            try {
    	
            fileContent = Files.lines(Paths.get(filePath))
                        .collect(Collectors.joining(System.lineSeparator()));
               } catch (IOException e) {
            e.printStackTrace();
        
         }
    
     List<String> strings = Stream.of(fileContent).map(w->w.split("\\s+")).flatMap(Arrays::stream).collect(Collectors.toList());
   
     Map<String,Integer> commonWords= new HashMap<String,Integer>();

    strings.forEach(obj -> {
	  commonWords.putIfAbsent(obj,0);
	  commonWords.put(obj,commonWords.get(obj)+1); }
    );
    
 
  
  return commonWords;
        
            
}

  

}
	
	
	

