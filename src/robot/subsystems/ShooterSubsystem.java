/*
 *	  Copyright (C) 2016  John H. Gaby
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
import robotCore.Encoder;
import robotCore.Encoder.EncoderType;
import robotCore.SmartMotor.SmartMotorMode;
import robotCore.PWMMotor;
//import constants
import static robot.Constants.ShooterConstants.*;
public class ShooterSubsystem extends SubsystemBase {

//create motor and encoder objects
private final PWMMotor s_motor = new PWMMotor(k_PWMPin, k_DirPin);
private static ShooterSubsystem instance;
  public static synchronized ShooterSubsystem getInstance(){
    if (instance == null) {
      instance = new ShooterSubsystem();
    }
    return instance;
  }
public final Encoder s_Encoder = new Encoder(EncoderType.Quadrature);

    public ShooterSubsystem() {

    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler 
    }

    //set power here 
    public void setPower(double s_power) {
        s_motor.set(s_power);
    }
    public Encoder getEncoder() {

      return (s_Encoder.clone());
  }



}

