/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stoman.utils;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JDialog;
import javax.swing.JPanel;

/**
 *
 * @author MinhNH
 */
/**
 * Tạo panel có thể kéo chuột di chuyển form dialog
 */
public class JPanelDrag extends JPanel {

    private Point initialClick;
    private JDialog dialog;

    public JPanelDrag(final JDialog dialog) {
        this.dialog = dialog;
        this.addEventsForDragging();
    }

    private void addEventsForDragging() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                initialClick = e.getPoint();
                getComponentAt(initialClick);
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {

                // get location of Window
                int thisX = dialog.getLocation().x;
                int thisY = dialog.getLocation().y;

                // Determine how much the mouse moved since the initial click
                int xMoved = e.getX() - initialClick.x;
                int yMoved = e.getY() - initialClick.y;

                // Move window to this position
                int X = thisX + xMoved;
                int Y = thisY + yMoved;
                dialog.setLocation(X, Y);
            }
        });

    }
}
