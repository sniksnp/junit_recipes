package chapter2.recipe11.test_object_that_instanciates_other_objects;

import java.io.File;
import java.io.FileNotFoundException;

public class FileNotFoundDeployer extends Deployer {

    public void deploy(Deployment deployment, File targetFile) throws FileNotFoundException {
        throw new FileNotFoundException(targetFile.getPath());
    }
}
