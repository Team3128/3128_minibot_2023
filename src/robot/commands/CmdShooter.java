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

package robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
//import shooter subsystem
import robot.subsystems.ShooterSubsystem;
import robotCore.Encoder;
//import encoder


public class CmdShooter extends CommandBase {
    //define stuff here, like power, subsystem, etc.
    private final ShooterSubsystem m_shooter;
    private final double m_power;

    public CmdShooter(ShooterSubsystem n_shooter, double n_power) {
        //parameters include the subsystem and power
        this.m_shooter = n_shooter;
        this.m_power = n_power;

        addRequirements(m_shooter);
    }

 
    @Override
    public void initialize() {
        //set power here
        m_shooter.setPower(m_power);
    }


    @Override
    public void execute() {
        //get speed of encoder here using the getEncoder() method from your subsystem
        double speed = m_shooter.s_Encoder.getSpeed();
    }


    //put isFinished() here 
    public boolean isFinished(){
        return false;
      }
 
    @Override
    public void end(boolean interrupted) {

    }
}
