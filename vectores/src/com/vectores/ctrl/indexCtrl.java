package com.vectores.ctrl;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zul.Label;

public class indexCtrl extends BaseCtrl {
    
    private Label lblSaludo;
    
    
@Override
public void doAfterCompose(Component comp) throws Exception {
    // TODO Auto-generated method stub
    super.doAfterCompose(comp);
    lblSaludo.setValue("hola desde el indexctrl");
    
}

public void onClick$btnSaludo(Event evt ) {
    lblSaludo.setValue("Haz hecho click");
    lblSaludo.setValue("color");
    
}

}
