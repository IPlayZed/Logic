package engine;


import static org.lwjgl.glfw.GLFW.*; //utility lib: Graphics Framework Library
import org.lwjgl.opengl.GL11; //opengl ver 11

/***
 * This is a Unity-like engine with similar layout and interface.
 *
 */
public class Core {
    public static void main(String[] args) {
        long window=App.Init(); //create the window

        //as long as window close state is false loop events
        while (!glfwWindowShouldClose(window)){
            glfwPollEvents(); //pool events for window
            glfwSwapBuffers(window);
        }

        //destroy the window
        glfwTerminate();
    }
}
