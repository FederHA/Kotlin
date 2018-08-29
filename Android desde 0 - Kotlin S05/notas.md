Link de presentacion https://drive.google.com/file/d/1pIedZc7R3jkGxseb-ijTUO1WrJiNs5yi/view

# Adapter
Un objeto actúa como puente entre un AdapterView y los datos a mostrar, el Adapter se encarga de hacer un View por cada Item

# AdapterView
Un AdapterView es un View cuyo hijos están determinados por un Adapter.

# ReciyClerView:
Es un View de tipo Lista, No es nativo, tienes que importar una dependencia. Ese componente se descarga de `support-library`, por que el recicyclerView va evolucionando, entonces cuando importas la libreria no tienes problemas de compatibilidad

### Pasos para implementar un RecyclerView

1. Importar la librería.

Importar la libreria desde https://developer.android.com/topic/libraries/support-library/packages?hl=es-419, 

```
dependencies {
  implementation 'com.android.support:recyclerview-v7:27.1.1'
}

```
2. Agregar RecyclerView en el Layout que deseamos la lista.
Crear un Layout para los ítems del recyclerView.

Los componentes que serán dinámicos deberán tener un ID.

NOTA: existen componentes nativos y de otras librerias. si se desea tener compativilidad con todas las versiones de android

  ```
 <?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <android.support.v7.widget.RecyclerView
        android:id="@+id/rvEmpleados"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:listitem="@layout/empleado_item"
        tools:itemCount="5">
    </android.support.v7.widget.RecyclerView>

</RelativeLayout>
  
  ```

3. Crear un Layout Item para la lista.

```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    android:orientation="vertical"
    android:padding="16dp"
    xmlns:android="http://schemas.android.com/apk/res/android" android:layout_width="match_parent"
    android:layout_height="wrap_content">

    <TextView
        android:id="@+id/tvNombre"
        android:text="NOMBRE EJEMPLO"
        android:textStyle="bold"
        android:textSize="18sp"
        android:layout_width="match_parent"
        android:layout_height="wrap_content" />

    <TextView
        android:id="@+id/tvEmail"
        android:text="EMAIL EJEMPLO"
        android:textStyle="italic"
        android:layout_width="match_parent"
        android:layout_height="wrap_content" />

</LinearLayout>
```

4. Crear un ViewHolder

5. Crear un Adapter

6. Asignar el Adapter al RecyclerView
