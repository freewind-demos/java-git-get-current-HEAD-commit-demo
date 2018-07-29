package demo;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.lib.*;

import java.io.File;

public class Hello {
    
    private static File localDir = new File(".");

    public static void main(String[] args) throws Exception {
        Repository repository = Git.open(localDir).getRepository();
        ObjectId id = repository.resolve(Constants.HEAD);
        String head = id.getName();
        System.out.println("head commit: " + head);
    }

}
