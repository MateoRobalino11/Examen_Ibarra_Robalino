package uta.edu.ec;

public class I_Vector_R {
    int I_indice_R;
    int I_valor_R;

/*    public int getI_indice_R() {
        return I_indice_R;
    }

    public int getI_valor_R() {
        return I_valor_R;
    }

    public void setI_indice_R(int i_indice_R) {
        I_indice_R = i_indice_R;
    }

    public void setI_valor_R(int i_valor_R) {
        I_valor_R = i_valor_R;
    }
*/
    public I_Vector_R(int i_valor_R) {
        I_indice_R =+1;
        I_valor_R = i_valor_R;
    }

    public int[] I_OrdenarPorIndices_R(I_Vector_R[] I_listaValores_R){
        int[] I_indices_R = new int[I_listaValores_R.length];
        int I_temp_R = 0;

        for (int c = 0 ; c<I_listaValores_R.length;c++){
            if(I_listaValores_R[c].I_valor_R>I_listaValores_R[c].I_valor_R){
                I_indices_R[c] = I_listaValores_R[c].I_indice_R;
            }
        }
        for (int i = 0 ; i<I_listaValores_R.length;i++){
            for (int j = 0 ; j<I_listaValores_R.length;j++){
                if(I_listaValores_R[i].I_valor_R>I_listaValores_R[j].I_valor_R){
                    I_temp_R = I_indices_R[j];
                    I_indices_R[j]=I_indices_R[i];
                    I_indices_R[i] = I_temp_R;
                }
            }
        }
        return I_indices_R;
    }

    /*public I_Vector_R[] I_OrdenarVector_R(int[][] I_valor_R){
        I_Vector_R[] I_temp_R;
        //Ingresar valores de los indices

        for(int i=0; i<I_valor_R.length;i++){
            I_valor_R[i][1] =
        }
        return null;
    }*/
}

