/**
 *	@Copyright 2015 firefreak11
 *
 *	This file is part of PowderInJava.
 *
 *	PowderInJava is free software: you can redistribute it and/or modify
 *	it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *
 *	PowderInJava is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *
 *	You should have received a copy of the GNU General Public License
 *	along with PowderInJava.  If not, see <http://www.gnu.org/licenses/>.
 **/

package powderinjava.elements;

import powderinjava.Particle;
import powderinjava.State;

public class WATR extends Element{

	public WATR(){
		super(WATR.class,State.LIQUID,0xff0000ff,50,1.0f,false,false,"Water. Boils at 100.0\u00b0C");
	}

	public int update(int x,int y,Particle p){
		if(p.temp>=100.0f){
			changeType(p,WTRV);
			return 1;
		}
		return 0;
	}
}
