package com.senac.TalesReceptorMicroservico.services;

import com.senac.TalesReceptorMicroservico.entitiy.Zap;
import com.senac.TalesReceptorMicroservico.repositories.ZapRepository;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZapService {

    private final ZapRepository zapRepository;

    @Autowired
    private RabbitTemplate rabbitTemplate;
    
    public ZapService(ZapRepository zapRepository) {
        this.zapRepository = zapRepository;
    }
    
    public List<Zap> findAll() {
        return zapRepository.findAll();
    }
    
    @RabbitListener(queues = "zap")
	private void subscribe(Zap zap) {
    	System.out.println("mensagem do zap do " + zap.getUsuario_nome() + ": " + zap.getUsuario_mensagem());
	}
    
}