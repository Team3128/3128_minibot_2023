/*
 *	  Copyright (C) 2022  John H. Gaby
 *
 *    This program is free software: you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published by
 *    the Free Software Foundation, version 3 of the License.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *    
 *    Contact: robotics@gabysoft.com
 */

package robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import robotCore.Device;
//import encoder, encoder type, and motor (PWMMotor)
import robotCore.Encoder;
import robotCore.Encoder.EncoderType;
import robotCore.PWMMotor;
//import constants
import static robot.Constants.TurnTableConstants.*;

public class TurntableSubsystem extends SubsystemBase {

	//create encoder and motor objects here
	private final PWMMotor tt_motor = new PWMMotor(k_PWMPin, k_DirPin);
	private static TurntableSubsystem instance;
	public static synchronized TurntableSubsystem getInstance(){
		if (instance == null) {
		  instance = new TurntableSubsystem();
		}
		return instance;
	  }
	  private final Encoder tt_Encoder = new Encoder(EncoderType.Quadrature);

	public TurntableSubsystem() {
		 
	}

	public void initDefaultCommand() {

	}

	//set power here
	public void setPower(double tt_power) {
        tt_motor.set(tt_power);
    }
	//get encoder here

	public Encoder get_ttEncoder() {
		return tt_Encoder;
	}

	@Override
	public void periodic() {
		
	}
}
