package com.htc.Day10.entity;

public class Marks {
String subjectname;
double score;
public Marks(String subjectname, double score) {
	super();
	this.subjectname = subjectname;
	this.score = score;
}
public Marks() {
	super();
	// TODO Auto-generated constructor stub
}
public String getSubjectname() {
	return subjectname;
}
public void setSubjectname(String subjectname) {
	this.subjectname = subjectname;
}
public double getScore() {
	return score;
}
public void setScore(double score) {
	this.score = score;
}
@Override
public String toString() {
	return "Marks [subjectname=" + subjectname + ", score=" + score + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	long temp;
	temp = Double.doubleToLongBits(score);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((subjectname == null) ? 0 : subjectname.hashCode());
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
	Marks other = (Marks) obj;
	if (Double.doubleToLongBits(score) != Double.doubleToLongBits(other.score))
		return false;
	if (subjectname == null) {
		if (other.subjectname != null)
			return false;
	} else if (!subjectname.equals(other.subjectname))
		return false;
	return true;
}
}
