import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

import example.IExample;


public class ExampleFactory {
	public static String CLASSPATHURL;
	
	public static IExample newInstance() throws Exception {
	    URLClassLoader tmp =
	      new URLClassLoader(new URL[] {getClassPath()})  {
	        public Class loadClass(String name) throws ClassNotFoundException {
		          if ("example.Example".equals(name))
						return findClass(name);
		          
					return super.loadClass(name);
				 
		        }
		      };
	 
	    return (IExample)
	      tmp.loadClass("example.Example").newInstance();
	  }

	private static URL getClassPath() {
		
		try {
			//File f = new File("F:/eclipse/workspace/HTMLProcessor/ClassLoaderTest/bin");
			return new URL(CLASSPATHURL);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
