package com.sujeeth.java;

import jdk.incubator.vector.FloatVector;
import jdk.incubator.vector.VectorSpecies;

public class VectorClass {
    public static void main(String[] args) {
        float[] a={1.0f,2.0f,3.0f,4.0f};
        float[] b={5.0f,6.0f,7.0f,8.0f};
        float[] c=new float[4];

        VectorSpecies<Float> SPECIES=FloatVector.SPECIES_128;

        FloatVector va= FloatVector.fromArray(SPECIES,a,0);
        FloatVector vb=FloatVector.fromArray(SPECIES,b,0);

        FloatVector vc=va.add(vb);

        vc.intoArray(c,0);

        for(float f:c){
            System.out.println(f);
        }
    }
}
