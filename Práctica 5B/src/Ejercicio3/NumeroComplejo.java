package Ejercicio3;

import java.util.Objects;

public class NumeroComplejo {
	private double re;
	private double im;
	
	public NumeroComplejo(double re, double im) {
		this.re = re;
		this.im = im;
	}
	
	public double realPart() {
		return re;
	}
	
	public double imaginaryPart() {
		return im;
	}
	
	public NumeroComplejo add(NumeroComplejo c) {
		NumeroComplejo nuevo = new NumeroComplejo(0,0); 
		
		nuevo.re = this.re + c.re;
		nuevo.im = this.im + c.im;
		
		return nuevo;
	}
	
	public NumeroComplejo subtract (NumeroComplejo c) {
		NumeroComplejo resultado = new NumeroComplejo(0, 0);
		
		resultado.re = this.re - c.re;
		resultado.im = this.im - c.im;		
		
		return resultado;
	}
	
	
	//(a * b) = (re_a * re_b - im_a * im_b) + (re_a * im_b + re_b * im_a)i
	public NumeroComplejo multiply (NumeroComplejo c) {
		NumeroComplejo resultado = new NumeroComplejo(0, 0);
		
		resultado.re = ((this.re * c.re) - (this.im * c.im));
		resultado.im = ((this.re * c.im) - (this.im * c.re));		
		
		return resultado;
	}
	
	
	// (a / b) = [(re_a * re_b + im_a * im_b) / (re_b^2 + im_b^2)] + [(im_a * re_b - re_a * im_b) / (re_b^2 + im_b^2)]i
	public NumeroComplejo divide (NumeroComplejo c) {
		NumeroComplejo resultado = new NumeroComplejo(0, 0);
		
		resultado.re = ((this.re * c.re) + (this.im * c.im)) / (c.re * c.re);
		resultado.im = ((this.im * c.re) - (this.re * c.im)) / (c.re * c.re);	
		
		return resultado;
	}


	// los crea automaticamente
	@Override
	public int hashCode() {
		return Objects.hash(im, re);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NumeroComplejo other = (NumeroComplejo) obj;
		return Double.doubleToLongBits(im) == Double.doubleToLongBits(other.im)
				&& Double.doubleToLongBits(re) == Double.doubleToLongBits(other.re);
	}

	@Override
	public String toString() {
		return "NumeroComplejo (re=" + re + ", im=" + im + ")";
	}

	
	//static porque es método de clase
	public static NumeroComplejo valueOf(double re, double im) {
		NumeroComplejo num = new NumeroComplejo(re, im);
		return num;
	}
	
	

}
