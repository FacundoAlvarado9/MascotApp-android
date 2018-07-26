package com.facundoalvarado.mascotapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.facundoalvarado.mascotapp.Fragments.AlimentacionFragment;
import com.facundoalvarado.mascotapp.Fragments.EnfermedadesFragment;
import com.facundoalvarado.mascotapp.Fragments.GuiaFragment;
import com.facundoalvarado.mascotapp.Fragments.MitosFragment;
import com.facundoalvarado.mascotapp.Fragments.VacunasFragment;
import com.facundoalvarado.mascotapp.Fragments.VeterinariasFragment;
import com.shrikanthravi.customnavigationdrawer2.data.MenuItem;
import com.shrikanthravi.customnavigationdrawer2.widget.SNavigationDrawer;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //Global Declaration
    SNavigationDrawer sNavigationDrawer;
    Class fragmentClass;
    public static Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sNavigationDrawer = findViewById(R.id.navigationDrawer);

//        Declarando lista de objetos en el menú
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("Alimentación", R.drawable.alimentacion_bg));
        menuItems.add(new MenuItem("Vacunación", R.drawable.vacunas_bg));
        menuItems.add(new MenuItem("Guía del dueño", R.drawable.guia_bg));
        menuItems.add(new MenuItem("Mitos", R.drawable.mitos_bg));
        menuItems.add(new MenuItem("Enfermedades", R.drawable.enfermedades_bg));
        menuItems.add(new MenuItem("Veterinarias", R.drawable.veterinarias_bg));
//        Añadiendo objetos al menu
        sNavigationDrawer.setMenuItemList(menuItems);

//        Declarando fragment principal
        fragmentClass =  AlimentacionFragment.class;
        try {
            fragment = (Fragment) fragmentClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (fragment != null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().setCustomAnimations(android.R.animator.fade_in, android.R.animator.fade_out).replace(R.id.frameLayout, fragment).commit();

//            Listener que maneja los clicks en items. Devuelve la posición que se selecciona para cambiar al fragment correspondiente.
            sNavigationDrawer.setOnMenuItemClickListener(new SNavigationDrawer.OnMenuItemClickListener() {
                @Override
                public void onMenuItemClicked(int position) {
                    System.out.println("Position "+position);

                    switch (position){
                        case 0:{
                            fragmentClass = AlimentacionFragment.class;
                            break;
                        }case 1:{
                            fragmentClass = VacunasFragment.class;
                            break;
                        }case 2:{
                            fragmentClass = GuiaFragment.class;
                            break;
                        }case 3:{
                            fragmentClass = MitosFragment.class;
                            break;
                        }case 4:{
                            fragmentClass = EnfermedadesFragment.class;
                            break;
                        }case 5:{
                            fragmentClass = VeterinariasFragment.class;
                            break;
                        }




                    }

                    //Listeners para acciones como abrir y cerrar el drawer
                    sNavigationDrawer.setDrawerListener(new SNavigationDrawer.DrawerListener() {

                        @Override
                        public void onDrawerOpened() {

                        }

                        @Override
                        public void onDrawerOpening(){

                        }

                        @Override
                        public void onDrawerClosing(){
                            System.out.println("Drawer closed");

                            try {
                                fragment = (Fragment) fragmentClass.newInstance();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }

                            if (fragment != null) {
                                FragmentManager fragmentManager = getSupportFragmentManager();
                                fragmentManager.beginTransaction().setCustomAnimations(android.R.animator.fade_in, android.R.animator.fade_out).replace(R.id.frameLayout, fragment).commit();

                            }
                        }

                        @Override
                        public void onDrawerClosed() {

                        }

                        @Override
                        public void onDrawerStateChanged(int newState) {
                            System.out.println("State "+newState);
                        }
                    });
                }
            });
        }
    }
}
