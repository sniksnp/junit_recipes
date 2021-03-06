package chapter2.recipe11.test_object_that_instanciates_other_objects;

import java.io.File;
import java.io.FileNotFoundException;

public class Deployment {
    private Deployer deployer;

    public Deployment() {
        this(Deployer.getInstance());
    }

    public Deployment(Deployer deployer) {
        this.deployer = deployer;
    }

    public boolean deploy(File targetFile) throws FileNotFoundException {
        return deployer.deploy(this, targetFile);
    }
}
