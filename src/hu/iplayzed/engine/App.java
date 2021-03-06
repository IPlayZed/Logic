package hu.iplayzed.engine;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL.createCapabilities;
import static org.lwjgl.opengl.GL11.glClearColor;

/***
 * This class is used for getting information about the app/window.
 */
public class App {
    /**
     * Window name, do not change this!
     */
    private static final String WIN_NAME = "LocalEngine";
    /**
     * Window width
     */
    private static int winWidth = 960;
    /**
     * Window height.
     */
    private static int winHeight = 540;
    /**
     * Window handler.
     */
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
        window = glfwCreateWindow(winWidth, winHeight, WIN_NAME,0,0);
        glfwShowWindow(window);
        glfwMakeContextCurrent(window);

        createCapabilities();
        glClearColor(0,0,0,1);

        return window;
    }
}
