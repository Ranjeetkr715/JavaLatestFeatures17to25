package com.java18.vectorApi;

import jdk.incubator.vector.IntVector;
import jdk.incubator.vector.VectorSpecies;

public class VectorApiFeature {

    static final VectorSpecies<Integer> SPECIES =IntVector.SPECIES_PREFERRED;
    public static void main(String [] args){
        int [] a = {1,2,3,4};
        int [] b = {5,6,7,8};
        int [] c = new int [4];

        var va = IntVector.fromArray(SPECIES,a,0);
        var vb = IntVector.fromArray(SPECIES,b,0);
        var vc = va.add(vb);
        vc.intoArray(c,0);

        for(int x  : c){
            System.out.println(x);
        }
    }
}
