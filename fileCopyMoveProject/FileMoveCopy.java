
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FileMoveCopy {
    
    //source input 
    private String sourceInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the source file path: ");
        String sourcePath = sc.nextLine();
        if(!validatePath(sourcePath)){
            System.out.println("Invalid source path. Please try again.");
            return sourceInput();
        }
        else{
            return sourcePath;
        }
    }
    //destination input 
    private String destinationInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the destination file path: ");
        String destinationPath = sc.nextLine();
        if(!validatePath(destinationPath)){
            System.out.println("Invalid destination path. Please try again.");
            return sourceInput();
        }
        return destinationPath;
    }
    //action input
    private String actionInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the action (move/copy): ");
        String action = sc.nextLine();
        if(!validateAction(action)){
            System.out.println("Invalid action. Please try again.");
            return actionInput();
        }
        return action;
    }
    //validate path
    private boolean validatePath(String inputPath) {
        Path path = Paths.get(inputPath);
        if (inputPath.isEmpty() || !Files.exists(path)) {
            System.out.println("Source and destination paths cannot be empty.");
            return false;
        }
        return true;
    }
    //validate action
    private boolean validateAction(String action) {
            if(action.isEmpty() || action==null || action.isBlank()){
                System.out.println("Empty/null/Blank Action not allowed, Action must be either 'move' or 'copy'.");
                return false;
            }
            else if(!action.equalsIgnoreCase("move") && !action.equalsIgnoreCase("copy")){
                System.out.println("Action must be either 'move' or 'copy'.");
                return false;
            }
            else{
                return true;
            }

        }
    
    
    
    
    
    
    public String getInputs(){
        sourceInput();
        destinationInput();
        actionInput();
        
        return null;
    }
    public static void main(String[] args) {
        FileMoveCopy fmc = new FileMoveCopy();
        fmc.getInputs();
        
    }
    /*if (!action.equalsIgnoreCase("move") && !action.equalsIgnoreCase("copy")) {
        System.out.println("Action must be either 'move' or 'copy'.");
        return false;
    }*/
    
}