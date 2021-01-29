package engine;


import org.lwjgl.opengl.GL11;

import static org.lwjgl.glfw.GLFW.*;

/***
 * This is a Unity-like engine with similar layout and interface.
 *
 */
public class Core {
    public static void main(String[] args) {
        long window=App.Init(); //create the window

        //as long as window close state is false loop events
        while (!glfwWindowShouldClose(window)) {
            glfwPollEvents(); //pool events for window

            GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
            GL11.glClearColor(0, 0, 0, 1);

            glfwSwapBuffers(window);
        }

        //destroy the window
        glfwTerminate();
    }
}
