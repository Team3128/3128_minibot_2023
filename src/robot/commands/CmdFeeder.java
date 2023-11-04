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
import robotCore.Encoder;
import robot.subsystems.FeederSubsystem;
//import encoder and feeder subsystem 

public class CmdFeeder extends CommandBase {
	//define stuff here, like subsystem, power, etc.
	private final double m_power;
	private final FeederSubsystem m_feeder;

	public CmdFeeder(FeederSubsystem f_feeder, double f_power) {
		//parameters include the subsystem and the power 
		
		this.m_power = f_power;
		this.m_feeder = f_feeder;

		addRequirements(m_feeder);
	}

	@Override
	public void initialize() {
		//set power here
		m_feeder.setPower(m_power);
	}


	@Override
	public void execute() {
		
	}

	//put isFinished here 
	public boolean isFinished(){
		return false;
	}

	@Override
	public void end(boolean interrupted) {
		m_feeder.setPower(0); 
	}
}
