package com.loop.test.day11_waits_pom;

import com.loop.pages.LoopPracticeDragDropPage;
import com.loop.test.utilities.Driver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class T1_drag_drop_pom {

    /*
    Loop Practice Drag and Drop Test
    1. Open a chrome browser
    2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
    3. validate expected default text appears on big circle
    Expected = "Drag the small circle here."

    Loop Practice Drag and Drop Test
    1. Open a chrome browser
    2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
    3. Click and hold small circle
    4. validate "Drop here." text appears on big circle

    1. Open a chrome browser
    2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
    3. Click and hold small circle
    4. Move it on top of the big circle
    5. validate “Now drop…” text appears on big circ

    1. Open a chrome browser
    2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
    3. Click and hold small circle
    4. Dropped anywhere outside of big circle
    5. validate “Try again!” text appears on big circle
     */

    @Test
    public void drag_small_here_test(){
        Driver.getdriver().get("https://loopcamp.vercel.app/drag-and-drop-circles.html");
        LoopPracticeDragDropPage loopPracticeDragDropPage = new LoopPracticeDragDropPage();
        String expected = "Drag the small circle here.";
        String actual = loopPracticeDragDropPage.bigCircle.getText();
        assertEquals(actual, expected, "Actual does not match the expected");
    }

}