/*
 *	  Copyright (C) 2016  John H. Gaby
 *
 *    This program is free software: you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published by
 *    the Free S4`oftware Foundation, version 3 of the License.
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
import robotCore.PWMMotor;
import robotCore.Encoder.EncoderType;

//import constants
import static robot.Constants.FeederConstants.*;

public class FeederSubsystem extends SubsystemBase {
	
	//create subsystem instance
	private static FeederSubsystem instance;
	public static synchronized FeederSubsystem getInstance(){
		if (instance == null) {
			instance = new FeederSubsystem();
		}
		return instance;
	}


	//create motor object
	private PWMMotor f_motor = new PWMMotor(k_PWMPin, k_DirPin);

	//create encoder object
	public final Encoder f_encoder = new Encoder(EncoderType.Quadrature);

	

	public FeederSubsystem() {
		
	}


	//set your motor power here
	public void setPower(double f_power) {
		f_motor.set(f_power);
	}


	//get encoder value here
	public Encoder getEncoder() {
		return f_encoder;
	}

	
	@Override
	public void periodic() {
		// This method will be called once per scheduler run
	}

}
