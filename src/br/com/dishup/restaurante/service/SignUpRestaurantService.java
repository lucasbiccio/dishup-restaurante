package br.com.dishup.restaurante.service;

import java.util.Date;
import org.hibernate.Session;
import org.hibernate.Transaction;
import br.com.dishup.core.codedata.StatusPropostaCD;
import br.com.dishup.core.entity.PropostaRestauranteEntity;
import br.com.dishup.core.exception.CargoNotFoundException;
import br.com.dishup.core.exception.CidadeNotFoundException;
import br.com.dishup.core.exception.DishUpException;
import br.com.dishup.core.exception.EstadoNotFoundException;
import br.com.dishup.core.exception.FieldValidatorException;
import br.com.dishup.core.exception.PaisNotFoundException;
import br.com.dishup.core.exception.RestauranteNotFoundException;
import br.com.dishup.core.exception.StatusPropostaNotFoundException;
import br.com.dishup.core.exception.TipoCulinariaNotFoundException;
import br.com.dishup.core.persistence.CargoDAO;
import br.com.dishup.core.persistence.CidadeDAO;
import br.com.dishup.core.persistence.EstadoDAO;
import br.com.dishup.core.persistence.HibernateUtil;
import br.com.dishup.core.persistence.PaisDAO;
import br.com.dishup.core.persistence.PropostaRestauranteDAO;
import br.com.dishup.core.persistence.RestauranteDAO;
import br.com.dishup.core.persistence.StatusPropostaDAO;
import br.com.dishup.core.persistence.TipoCulinariaDAO;
import br.com.dishup.core.util.FieldValidatorUtil;

public class SignUpRestaurantService {
	
	public void preencherProposta(String emailRestaurante, String CNPJraiz, String CNPJfilial, String CNPJcontrole, String razaoSocial, 
			String CEP, String logradouro, String numero, String complemento, String bairro, int idCidade, int idEstado, int idPais,
			String DDDtelefoneRestaurante, String telefoneRestaurante, String siteRestaurante, int idTipoCulinaria, String CPFraizResponsavel, 
			String CPFcontroleResponsavel, String nomeResponsavel, int idCargo, String DDDtelefoneResponsavel, String telefoneResponsavel )
					throws FieldValidatorException, DishUpException{
		
		if(!FieldValidatorUtil.isValidEmail(emailRestaurante))
			throw new FieldValidatorException("EMAIL INFORMADO INVALIDO");
		if(!FieldValidatorUtil.isValidCNPJ(CNPJraiz, CNPJfilial, CNPJcontrole))
			throw new FieldValidatorException("CNPJ INFORMADO INVALIDO");
		if(FieldValidatorUtil.isEmpty(razaoSocial))
			throw new FieldValidatorException("RAZAO SOCIAL NAO INFORMADA OU INVALIDA");
		if(!FieldValidatorUtil.isValidCEP(CEP))
			throw new FieldValidatorException("CEP INFORMADO INVALIDO");
		if(FieldValidatorUtil.isEmpty(logradouro))
			throw new FieldValidatorException("LOGRADOURO NAO INFORMADO OU INVALIDO");
		if(FieldValidatorUtil.isEmpty(bairro))
			throw new FieldValidatorException("BAIRRO NAO INFORMADO OU INVALIDO");
		if(!FieldValidatorUtil.isValidId(idCidade))
			throw new FieldValidatorException("CIDADE NAO INFORMADA OU INVALIDA");
		if(!FieldValidatorUtil.isValidId(idEstado))
			throw new FieldValidatorException("ESTADO NAO INFORMADO OU INVALIDO");		
		if(!FieldValidatorUtil.isValidId(idCidade))
			throw new FieldValidatorException("PAIS NAO INFORMADO OU INVALIDO");
		if(!FieldValidatorUtil.isValidDDD(DDDtelefoneRestaurante))
			throw new FieldValidatorException("DDD TELEFONE RESTAURANTE NAO INFORMADO OU INVALIDO");
		if(!FieldValidatorUtil.isValidTelephone(telefoneRestaurante))
			throw new FieldValidatorException("TELEFONE RESTAURANTE NAO INFORMADO OU INVALIDO");
		if(!FieldValidatorUtil.isValidId(idTipoCulinaria))
			throw new FieldValidatorException("TIPO DE CULINARIA INVALIDA OU NAO INFORMADA");
		if(!FieldValidatorUtil.isValidCPF(CPFraizResponsavel, CPFcontroleResponsavel))
			throw new FieldValidatorException("CPF RESPONSAVEL INVALIDO OU NAO INFORMADO");
		if(FieldValidatorUtil.isEmpty(nomeResponsavel))
			throw new FieldValidatorException("NOME RESPONSAVEL INVALIDO OU NAO INFORMADO");
		if(!FieldValidatorUtil.isValidId(idCargo))
			throw new FieldValidatorException("CARGO INVALIDO OU NAO INFORMADO");
		if(!FieldValidatorUtil.isValidDDD(DDDtelefoneResponsavel))
			throw new FieldValidatorException("DDD TELEFONE RESPONSAVEL NAO INFORMADO OU INVALIDO");
		if(!FieldValidatorUtil.isValidTelephone(telefoneResponsavel))
			throw new FieldValidatorException("TELEFONE RESPONSAVEL NAO INFORMADO OU INVALIDO");
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		PropostaRestauranteDAO propostaDAO = new PropostaRestauranteDAO();
		RestauranteDAO restauranteDAO = new RestauranteDAO();
		CidadeDAO cidadeDAO = new CidadeDAO();
		EstadoDAO estadoDAO = new EstadoDAO();
		PaisDAO paisDAO = new PaisDAO();
		TipoCulinariaDAO tipoCulinariaDAO = new TipoCulinariaDAO();
		CargoDAO cargoDAO = new CargoDAO();
		StatusPropostaDAO statusPropostaDAO = new StatusPropostaDAO();
		
		if(!propostaDAO.hasPropostaPendente(session, CNPJraiz, CNPJfilial, CNPJcontrole)){
			try {
				restauranteDAO.selectByCNPJ(session, CNPJraiz, CNPJfilial, CNPJcontrole);
				throw new DishUpException("RESTAURANTE INFORMADO JA POSSUI CADASTRO NO SISTEMA");
			} catch (RestauranteNotFoundException e) {
				try{
					PropostaRestauranteEntity proposta = new PropostaRestauranteEntity(
							0, 
							new Date(), 
							statusPropostaDAO.selectById(session, StatusPropostaCD.PROPOSTA_PENDING.getId()), 
							null, 
							null, 
							emailRestaurante, 
							CNPJraiz, 
							CNPJfilial, 
							CNPJcontrole, 
							razaoSocial, 
							CEP, 
							logradouro, 
							numero, 
							complemento, 
							bairro, 
							cidadeDAO.selectById(session, idCidade), 
							estadoDAO.selectById(session, idEstado), 
							paisDAO.selectById(session, idPais), 
							DDDtelefoneRestaurante, 
							telefoneRestaurante, 
							siteRestaurante, 
							tipoCulinariaDAO.selectById(session, idTipoCulinaria), 
							CPFraizResponsavel, 
							CPFcontroleResponsavel, 
							nomeResponsavel, 
							cargoDAO.selectById(session, idCargo), 
							DDDtelefoneResponsavel, 
							telefoneResponsavel);
					propostaDAO.insert(session, proposta);
					transaction.commit();
				}catch (StatusPropostaNotFoundException e1) {
					e1.printStackTrace();
					throw new DishUpException("SISTEMA TEMPORARIAMENTE INDISPONIVEL");
				} catch (CidadeNotFoundException e1) {
					e1.printStackTrace();
					throw new DishUpException("SISTEMA TEMPORARIAMENTE INDISPONIVEL");
				} catch (EstadoNotFoundException e1) {
					e1.printStackTrace();
					throw new DishUpException("SISTEMA TEMPORARIAMENTE INDISPONIVEL");
				} catch (PaisNotFoundException e1) {
					e1.printStackTrace();
					throw new DishUpException("SISTEMA TEMPORARIAMENTE INDISPONIVEL");
				} catch (TipoCulinariaNotFoundException e1) {
					e1.printStackTrace();
					throw new DishUpException("SISTEMA TEMPORARIAMENTE INDISPONIVEL");
				} catch (CargoNotFoundException e1) {
					e1.printStackTrace();
					throw new DishUpException("SISTEMA TEMPORARIAMENTE INDISPONIVEL");
				}finally{
					session.close();
				}
			}
		}
		else{
			throw new DishUpException("RESTAURANTE INFORMADO JA POSSUI PROPOSTA EM ANDAMENTO");
		}
	}
}
