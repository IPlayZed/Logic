package hu.iplayzed.engine;


import org.lwjgl.opengl.GL11;

import static org.lwjgl.glfw.GLFW.*;

/***
 * This is a Unity-like engine with similar layout and interface.
 * @author IPlayZed
 * @version 01.30.01.2021
 */
public class Core {
    public static void main(String[] args) {
        long window = App.Init(); //create the window

        //does not need to be this set color, just for demonstration purposes
        Color clearColor = Color.yellow();

        //as long as window close state is false loop events
        while (!glfwWindowShouldClose(window)) {
            glfwPollEvents(); //pool events for window

            //see https://docs.gl/gl4/glClear
            GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
            GL11.glClearColor(clearColor.getR(), clearColor.getG(),
                    clearColor.getB(), 1);

            glfwSwapBuffers(window);
        }

        //destroy the window
        glfwTerminate();
    }
}
