package co.edu.uniquindio.poo.mapping.mappers;
import co.edu.uniquindio.poo.mapping.dto.ClienteDto;
import co.edu.uniquindio.poo.mapping.dto.EmpleadoDto;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Empleado;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface BancoMapper {
    BancoMapper INSTANCE = Mappers.getMapper(BancoMapper.class);

    @Named("empleadoToEmpleadoDto")
    EmpleadoDto empleadoToEmpleadoDto(Empleado empleado);

    Empleado empleadoDtoToEmpleado(EmpleadoDto empleadoDto);

    @IterableMapping(qualifiedByName = "empleadoToEmpleadoDto")
    List<EmpleadoDto> getEmpleadosDto(List<Empleado> listaEmpleados);

//    @Named("mappingToEmpeladoDto")
//    EmpleadoDto mappingToEmpeladoDto(Empleado empleado);


    @Mapping(target = "nombreCliente", source = "cliente.nombre")
    @IterableMapping(qualifiedByName = "cunetaToCuentaDto")
    ClienteDto clienteToClienteDto(Cliente cliente);


}
