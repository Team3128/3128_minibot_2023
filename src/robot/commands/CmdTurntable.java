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
//import encoder 
import robotCore.Encoder;
//import Turntable subsystem
import robot.subsystems.TurntableSubsystem;

public class CmdTurntable extends CommandBase {
    //define stuff here, like power, subsystem, etc.
    private final TurntableSubsystem m_Turntable;
    private final double m_power;
    
    public CmdTurntable(TurntableSubsystem n_Turntable, double n_power) {
        //parameters include the subsystem and power
        this.m_Turntable = n_Turntable;
        this.m_power = n_power;
        addRequirements(m_Turntable);
    }

  
    @Override
    public void initialize() {

    //set power here
    m_Turntable.setPower(m_power);

    }


    @Override
    public void execute() {
    
    }

    //put isFinished() here
    public boolean isFinished(){
		return false;
	}

 
    @Override
    public void end(boolean interrupted) {
    

    }
}
