package com.betrybe.acc.java.service;

import com.betrybe.acc.java.domain.Data;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.time.ZoneId;

@Service
public class DataService {
  public Data retornaDataAtual() {
    return new Data(LocalDateTime.now(ZoneId.of("UTC")));
    // return new Data(LocalDateTime.now(ZoneId.of("America/Sao_Paulo")));
  }
}
