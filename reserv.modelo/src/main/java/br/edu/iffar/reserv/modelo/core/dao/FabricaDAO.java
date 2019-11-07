package br.edu.iffar.reserv.modelo.core.dao;

/**
 * <p>
 * Classe responsável por manter uma instancia única (singleton) da
 * implementação concreta do padrão DAO. Ou seja, define o modelo de
 * persistencia
 * </p>
 * 
 * @author Professor
 * @since Sep 10, 2019 9:20:34 PM
 */
public class FabricaDAO {
	// representa a implementacao do modelo de persistencia
	private static IDAO modelo;

	/**
	 * <p>
	 * Define o modelo de persistencia
	 * 
	 * @param daoImpl
	 *            implementação da interface {@link IDAO}
	 */
	public static void defineModelo(IDAO daoImpl) {
		modelo = daoImpl;
	}
    /**
     * <p>
     * Retorna o modelo de persistencia adotado na aplicação
     * </p>
     * @return
     */
	public static IDAO getModelo() {
		if ( modelo == null ) {
			StringBuffer sb = new StringBuffer();
			sb.append("Modelo de persistência não definido! ");
			sb.append(" Utiliza a chamada para FabricaDAO.defineModelo ");
			sb.append(" passando uma implementação da interface ");
			sb.append(" IDAO ");
			throw new RuntimeException(sb.toString());
		}
		return modelo;
	}
}
