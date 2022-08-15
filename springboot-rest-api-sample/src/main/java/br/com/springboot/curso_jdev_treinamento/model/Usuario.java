package br.com.springboot.curso_jdev_treinamento.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "seq_usuario", sequenceName = "seq_usuario", allocationSize = 1, initialValue = 1)
public class Usuario implements Serializable, List<Usuario>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_usuario")
	private long id;
	private String nome;
	private int idade;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Iterator<Usuario> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean add(Usuario e) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean addAll(Collection<? extends Usuario> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean addAll(int index, Collection<? extends Usuario> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Usuario get(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Usuario set(int index, Usuario element) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void add(int index, Usuario element) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Usuario remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public ListIterator<Usuario> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ListIterator<Usuario> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Usuario> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
