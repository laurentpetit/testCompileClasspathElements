package testCompileClasspathElements;

import java.util.List;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;

/**
 * @goal print
 * @requiresDependencyResolution compile
 */
public class TestMojo extends AbstractMojo {
	/**
	 * Project classpath.
	 * @parameter default-value="${project.compileClasspathElements}"
	 * @required
	 */
	protected List<String> classpathElements;

    public void execute() throws MojoExecutionException {
    	getLog().info("+++++ testCompileClasspathElements found classpath elements:");
    	for (String cpe: classpathElements) {
    		getLog().info("  - " + cpe);
    	}
    }

}
