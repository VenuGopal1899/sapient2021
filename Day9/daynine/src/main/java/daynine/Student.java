/**
 * 
 */
package daynine;

/**
 * @author admi
 *
 */
public class Student implements Comparable<Student>{
	
	private Integer admissionCode;
	private String studentName;
	private Integer marks;
	/**
	 * @param admissionCode
	 * @param studentName
	 * @param marks
	 */
	public Student(Integer admissionCode, String studentName, Integer marks) {
		super();
		this.admissionCode = admissionCode;
		this.studentName = studentName;
		this.marks = marks;
	}
	
	
	public Student() {
		
	}
	/**
	 * @return the admissionCode
	 */
	public Integer getAdmissionCode() {
		return admissionCode;
	}
	/**
	 * @param admissionCode the admissionCode to set
	 */
	public void setAdmissionCode(Integer admissionCode) {
		this.admissionCode = admissionCode;
	}
	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}
	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	/**
	 * @return the marks
	 */
	public Integer getMarks() {
		return marks;
	}
	/**
	 * @param marks the marks to set
	 */
	public void setMarks(Integer marks) {
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Student [admissionCode=" + admissionCode + ", studentName=" + studentName + ", marks=" + marks + "]";
	}


	
	// This overridden method generate same integer value for two equal objects
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((admissionCode == null) ? 0 : admissionCode.hashCode());
		result = prime * result + ((marks == null) ? 0 : marks.hashCode());
		result = prime * result + ((studentName == null) ? 0 : studentName.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (admissionCode == null) {
			if (other.admissionCode != null)
				return false;
		} else if (!admissionCode.equals(other.admissionCode))
			return false;
		if (marks == null) {
			if (other.marks != null)
				return false;
		} else if (!marks.equals(other.marks))
			return false;
		if (studentName == null) {
			if (other.studentName != null)
				return false;
		} else if (!studentName.equals(other.studentName))
			return false;
		return true;
	}


	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(this.admissionCode == o.admissionCode) {
			return 0;
		}else {
			return this.admissionCode > o.admissionCode ? 1 : -1;
		}
		
		
	}
	
	

}
