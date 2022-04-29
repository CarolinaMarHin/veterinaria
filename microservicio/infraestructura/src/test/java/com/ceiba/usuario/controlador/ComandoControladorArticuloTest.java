package com.ceiba.usuario.controlador;

import com.ceiba.ApplicationMock;
import com.ceiba.usuario.comando.ComandoArticulo;
import com.ceiba.usuario.servicio.testdatabuilder.ComandoArticuloTestDataBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(ComandoControladorArticulo.class)
@ContextConfiguration(classes= ApplicationMock.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
class ComandoControladorArticuloTest {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private MockMvc mocMvc;

    @Test
    @DisplayName("Deberia crear un articulo")
    void deberiaCrearUnArticulo() throws Exception{
        ComandoArticulo articulo = new ComandoArticuloTestDataBuilder().build();
        mocMvc.perform(post("/articulo")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(articulo)))
                .andExpect(status().isOk());
    }
}
