package entityBanco;

import interfaceBanco.KeyAdmin;

public class PenDrive  implements KeyAdmin{

	@Override
	public Boolean token(Boolean value) {
		if(!value) {
			return null;
		}
		return value;
	}
	

}
