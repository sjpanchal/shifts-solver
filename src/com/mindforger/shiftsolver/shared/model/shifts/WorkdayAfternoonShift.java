package com.mindforger.shiftsolver.shared.model.shifts;

import com.mindforger.shiftsolver.shared.ShiftSolverConstants;
import com.mindforger.shiftsolver.shared.model.Holder;

public class WorkdayAfternoonShift implements ShiftSolution {

	public Holder<String> editor;
	public Holder<String>[] staffers;
	public Holder<String> sportak;
	
	@SuppressWarnings("unchecked")
	public WorkdayAfternoonShift() {
		staffers=new Holder[4];
	}
	
	public int isEmployeeAllocated(String key) {
		if(editor!=null && editor.get().equals(key)) {
			return ShiftSolverConstants.SHIFT_AFTERNOON;
		}
		if(staffers!=null) {
			for(Holder<String> e:staffers) {
				if(e!=null && e.get().equals(key)) {
					return ShiftSolverConstants.SHIFT_AFTERNOON;
				}
			}
		}
		if(sportak!=null && sportak.get().equals(key)) {
			return ShiftSolverConstants.SHIFT_AFTERNOON;
		}
		return ShiftSolverConstants.NO_SHIFT;		
	}
}
