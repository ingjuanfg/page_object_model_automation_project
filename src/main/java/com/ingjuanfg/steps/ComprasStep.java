package com.ingjuanfg.steps;

import com.ingjuanfg.pages.ComprasPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class ComprasStep {
    @Page
    private ComprasPage comprasPage;

    @Step
    public void compraRealizadaConExito(){
        comprasPage.imagenCompraExitosa();
    }
}
