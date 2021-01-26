package engine;

import org.lwjgl.opengl.GL;

import static org.lwjgl.glfw.GLFW.glfwCreateWindow;
import static org.lwjgl.glfw.GLFW.glfwInit;
import static org.lwjgl.glfw.GLFW.glfwShowWindow;
import static org.lwjgl.glfw.GLFW.glfwMakeContextCurrent;

/***
 * This class is used for getting information about the app/window.
 */
public class App {
    /** Window name, do not change this! */
    private static final String winName ="LocalEngine";
    /** Window width */
    private static int winWidth =960;
    /** Window height. */
    private static int winHeight =540;
    /** Window handler. */
    private static long window;

    /***
     * Attempts to initialize glfw and return the window handler.
     * @return window handler
     */
    public static long Init() {
        if (!glfwInit()) {
            System.err.println("GLFW failed to initialize!");
            System.exit(-1);
        }
        window=glfwCreateWindow(winWidth, winHeight,winName,0,0);
        glfwShowWindow(window);
        glfwMakeContextCurrent(window);

        GL.createCapabilities();
        return window;
    }
}
