package com.wjx.test.pattern.LSP;

import javax.swing.undo.AbstractUndoableEdit;

/**
 * Created by hacke on 2017/4/23.
 */
public class Rifle extends AbstractGun {
    @Override
    public void shoot() {
        System.out.println("rifle shooting.");
    }
}
