package com.bit.labores.tools;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;

public class SharedPreferencesHandler {

    public static void guardarPreferencia(Context contexto, String clave, Object valor, String tipo) {
        SharedPreferences preferencias = contexto.getSharedPreferences("Preferences", Context.MODE_PRIVATE);
        SharedPreferences.Editor editorPreferencias = preferencias.edit();
        switch (tipo) {
            case "string":
                editorPreferencias.putString(clave, (String) valor);
                break;
            case "int":
                editorPreferencias.putInt(clave, (Integer) valor);
                break;
            case "float":
                editorPreferencias.putFloat(clave, (Float) valor);
                break;
            case "long":
                editorPreferencias.putLong(clave, (Long) valor);
                break;
            case "boolean":
                editorPreferencias.putBoolean(clave, (Boolean) valor);
                break;
            case "set":
                editorPreferencias.putStringSet(clave, (Set<String>) valor);
                break;
        }
        editorPreferencias.commit();
        //Toast.makeText(contexto, "Se guardó '" + valor + "' como preferencia", Toast.LENGTH_SHORT).show();
    }

    public static Object obtenerPreferencia(Context contexto, String clave, String tipo) {
        SharedPreferences preferencias = contexto.getSharedPreferences("Preferences", Context.MODE_PRIVATE);
        Object retorno = new Object();
        switch (tipo) {
            case "string":
                retorno = preferencias.getString(clave, "");
                break;
            case "int":
                retorno = preferencias.getInt(clave, 0);
                break;
            case "float":
                retorno = preferencias.getFloat(clave, 0);
                break;
            case "long":
                retorno = preferencias.getLong(clave, 0);
                break;
            case "boolean":
                retorno = preferencias.getBoolean(clave, false);
                break;
            case "set":
                retorno = preferencias.getStringSet(clave, null);
                break;
        }
        return retorno;
    }
}
