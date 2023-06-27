package com.senac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParImparTest {

    @Test
    void par() {
       boolean valida = ParImpar.valida(3);
        Assertions.assertTrue(valida);
    }
}