package co.com.technical_test_alianza.service.impl;

import co.com.technical_test_alianza.enums.LogLevel;
import co.com.technical_test_alianza.model.Client;
import co.com.technical_test_alianza.repository.ClientRepository;
import co.com.technical_test_alianza.service.ClientService;
import co.com.technical_test_alianza.utils.EventLog;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;
    private final EventLog eventLog;

    @Override
    public Client SaveClient(Client client) {
        eventLog.logEvent(String.valueOf(LogLevel.info),"Guardando cliente");
       try{
           Client savedClient = clientRepository.save(client);
           eventLog.logEvent(String.valueOf(LogLevel.info),"Cliente Guardado Exitosamente");
           return savedClient;
       }catch(Exception e){
           eventLog.logEvent(String.valueOf(LogLevel.error),"Cliente no guardado");
           throw new RuntimeException("no se pudo guardar cliente");
       }
    }

    @Override
    public List<Client> FindAllClient() {
        eventLog.logEvent(String.valueOf(LogLevel.info),"Consultando Clientes");
        try {
            List<Client> clientAll = clientRepository.findAll();
            eventLog.logEvent(String.valueOf(LogLevel.info),"Clientes Extraidos Exitosamente");
            return clientAll;
        } catch (Exception e) {
            eventLog.logEvent(String.valueOf(LogLevel.error),"Error al Extraer Cliente");
            throw new RuntimeException("no se pudo obtener lista de clientes",e);
        }
    }

    @Override
    public Client FindByIdClient(String sharedKey) {
        eventLog.logEvent(String.valueOf(LogLevel.info),"Consultando Cliente por Id: "+ sharedKey);
        try {
            Optional<Client> optionalClient = clientRepository.findById(sharedKey);
            eventLog.logEvent(String.valueOf(LogLevel.info),"Consulta de Cliente exitosa ");
            return optionalClient.orElseThrow(() -> new RuntimeException("Cliente no encontrado con ID: " + sharedKey));
        } catch (Exception e) {
            eventLog.logEvent(String.valueOf(LogLevel.error),"Cliente no consultado con id:"+sharedKey);
            throw new RuntimeException("No se pudo encontrar el cliente con ID: " + sharedKey, e);
        }
    }
}
