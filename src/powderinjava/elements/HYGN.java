/**
 * @Copyright 2015 firefreak11
 * 
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 **/

package powderinjava.elements;

import powderinjava.Particle;
import powderinjava.State;

public class HYGN extends Element{

	public HYGN(){
		super(HYGN.class,State.GAS,0x0D86FF,0,3.42f,true,true,"Hydrogen. Creates water with oxygen.");
	}

	public int update(int x,int y,Particle p){
		if(elementAt(x,y)==FIRE||elementAt(x,y)==PLSM)
			p.burning=true;
		return 0;
	}
}
