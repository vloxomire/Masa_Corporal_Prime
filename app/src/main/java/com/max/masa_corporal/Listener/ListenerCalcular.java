package com.max.masa_corporal.Listener;

import android.content.Intent;
import android.view.View;

import com.max.masa_corporal.Actividad.Masa_Corporal;
import com.max.masa_corporal.Actividad.calcular_tu_masa;

public class ListenerCalcular implements View.OnClickListener{
    Masa_Corporal context_MasaCorp;

    public ListenerCalcular(Masa_Corporal context_MasaCorp) {
        this.context_MasaCorp = context_MasaCorp;
    }

    @Override
    public void onClick(View view) {
        Intent intent_Lst_Calcular=new Intent(context_MasaCorp,calcular_tu_masa.class);
        context_MasaCorp.startActivity(intent_Lst_Calcular);
    }
}