package sistemaGestaoRecursos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Humanos.Alunos;
import Humanos.Cozinheiros;
import Humanos.Instrutores;
import Humanos.Monitores;
import Humanos.Professores;
import Humanos.Serventes;
import Materiais.MaterialDidatico;
import Materiais.MaterialEscolar;
import Materiais.MaterialLimpeza;


public class Main {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int escolhaMenu = 0;
		int numHumanos = 0;
		int numAlunos = 0;
		int numCozinheiros = 0;
		int numInstrutores = 0;
		int numMonitores = 0;
		int numProfessores = 0;
		int numServentes = 0;
		ArrayList<Alunos> listaAlunos = new ArrayList<Alunos>();
		ArrayList<Professores> listaProfessores = new ArrayList<Professores>();
		ArrayList<Instrutores> listaInstrutores = new ArrayList<Instrutores>();
		ArrayList<Monitores> listaMonitores = new ArrayList<Monitores>();
		ArrayList<Serventes> listaServentes = new ArrayList<Serventes>();
		ArrayList<Cozinheiros> listaCozinheiros = new ArrayList<Cozinheiros>();
		ArrayList<MaterialDidatico> listaMatD = new ArrayList<MaterialDidatico>();
		ArrayList<MaterialEscolar> listaMatE = new ArrayList<MaterialEscolar>();
		ArrayList<MaterialLimpeza> listaMatL = new ArrayList<MaterialLimpeza>();
		
		while (escolhaMenu != 7) {
			System.out.println("Escolha uma opcao:");
			System.out.println("1. Cadastrar");
			System.out.println("2. Atualizar");
			System.out.println("3. Remover");
			System.out.println("4. Locacao de Recursos");
			System.out.println("5. Consulta");
			System.out.println("6. Relatorio Atual");
			System.out.println("7. Sair do Sistema");

			escolhaMenu = ler.nextInt();
			ler.nextLine();
			if( escolhaMenu == 1) {
				int cadastroTipo = 0;
				int escolhaCadastro = 0;
				while(cadastroTipo != 3) {
					System.out.println("Escolha um Tipo de Recurso:");
					System.out.println("1. Recurso Humano");
					System.out.println("2. Recurso Material");
					System.out.println("3. Voltar ao menu inicial");
					cadastroTipo = ler.nextInt();
					ler.nextLine();
					if(cadastroTipo == 1) {
						while (escolhaCadastro != 7) {
							System.out.println("Escolha o Recurso humano a ser cadastrado:");
							System.out.println("1. Aluno(a)");
							System.out.println("2. Cozinheiro(a)");
							System.out.println("3. Instrutor(a)");
							System.out.println("4. Monitor(a)");
							System.out.println("5. Professor(a)");
							System.out.println("6. Servente");
							System.out.println("7. Voltar ao menu anterior");
							escolhaCadastro = ler.nextInt();
							ler.nextLine();
								if(escolhaCadastro == 1) {
									Alunos aluno =new Alunos();
									System.out.println("Cadastro de aluno(a):");
									System.out.println("Escreva o nome do aluno(a):");
									aluno.setNome(ler.nextLine());
									System.out.println("Escreva o ID do aluno(a):");
									aluno.setId(ler.nextInt());
									listaAlunos.add(aluno);
									numHumanos++;
									numAlunos++;
									System.out.println("Aluno(a) cadastrado com sucesso!\n");
						
								}
								else if(escolhaCadastro == 2) {
									Cozinheiros cozinheiro =new Cozinheiros();
									System.out.println("Cadastro de cozinheiro(a):");
									System.out.println("Escreva o nome do cozinheiro(a):");
									cozinheiro.setNome(ler.nextLine());
									System.out.println("Escreva o ID do cozinheiro(a):");
									cozinheiro.setId(ler.nextInt());
									listaCozinheiros.add(cozinheiro);
									numHumanos++;
									numCozinheiros++;
									System.out.println("Cozinheiro(a) cadastrado com sucesso!\n");
						
								}
								else if(escolhaCadastro == 3) {
									Instrutores instrutor =new Instrutores();
									System.out.println("Cadastro de instrutor(a):");
									System.out.println("Escreva o nome do instrutor(a):");
									instrutor.setNome(ler.nextLine());
									System.out.println("Escreva o ID do instrutor(a):");
									instrutor.setId(ler.nextInt());
									listaInstrutores.add(instrutor);
									numHumanos++;
									numInstrutores++;
									System.out.println("Instrutor(a) cadastrado com sucesso!\n");
						
								}
								else if(escolhaCadastro == 4) {
									Monitores monitor =new Monitores();
									System.out.println("Cadastro de monitor(a):");
									System.out.println("Escreva o nome do monitor(a):");
									monitor.setNome(ler.nextLine());
									System.out.println("Escreva o ID do monitor(a):");
									monitor.setId(ler.nextInt());
									listaMonitores.add(monitor);
									numHumanos++;
									numMonitores++;
									System.out.println("Monitor(a) cadastrado com sucesso!\n");
						
								}
								else if(escolhaCadastro == 5) {
									Professores professor =new Professores();
									System.out.println("Cadastro de professor(a):");
									System.out.println("Escreva o nome do professor(a):");
									professor.setNome(ler.nextLine());
									System.out.println("Escreva o ID do professor(a):");
									professor.setId(ler.nextInt());
									listaProfessores.add(professor);
									numHumanos++;
									numProfessores++;
									System.out.println("Professor(a) cadastrado com sucesso!\n");
						
								}
								else if(escolhaCadastro == 6) {
									Serventes servente =new Serventes();
									System.out.println("Cadastro de servente:");
									System.out.println("Escreva o nome do servente:");
									servente.setNome(ler.nextLine());
									System.out.println("Escreva o ID do servente:");
									servente.setId(ler.nextInt());
									listaServentes.add(servente);
									numHumanos++;
									numServentes++;
									System.out.println("Servente cadastrado com sucesso!\n");
						
								}
						
			}
			}
				else if (cadastroTipo == 2) {
					while (escolhaCadastro != 4) {
						System.out.println("Escolha o Recurso material a ser cadastrado:");
						System.out.println("1. Material Didatico");
						System.out.println("2. Material Escolar");
						System.out.println("3. Material de Limpeza");
						System.out.println("4. Voltar ao menu anterior");
						escolhaCadastro = ler.nextInt();
						ler.nextLine();
						if(escolhaCadastro == 1) {
							String nome;
							int qntd;
							System.out.println("Cadastro de material didatico:");
							System.out.println("Escreva o nome do material didatico:");
							nome = ler.nextLine();
							int i = 0;
							for(MaterialDidatico didaticos: listaMatD) {
								if(nome.equals(didaticos.getNome())) {
									System.out.println("Material já cadastrado.\n");
									i++;
									break;
								}
							}
							if(i != 0) {
								break;
							}
							else {
							System.out.println("Escreva a quantidade a ser adicionado desse material:"); 
							qntd = ler.nextInt();
							MaterialDidatico didatico =new MaterialDidatico(nome, qntd);
							listaMatD.add(didatico);
							System.out.println("Material cadastrado com sucesso!\n");
							}
						}
						else if(escolhaCadastro == 2) {
							String nome;
							int qntd;
							System.out.println("Cadastro de material escolar:");
							System.out.println("Escreva o nome do material escolar:");
							nome = ler.nextLine();
							int i = 0;
							for(MaterialEscolar escolares: listaMatE) {
								if(nome.equals(escolares.getNome())) {
									System.out.println("Material já cadastrado.");
									i++;
									break;
								}
							}
							if(i != 0) {
								break;
							}
							else {
							System.out.println("Escreva a quantidade a ser adicionado desse material:"); 
							qntd = ler.nextInt();
							MaterialEscolar escolar =new MaterialEscolar(nome, qntd);
							listaMatE.add(escolar);
							System.out.println("Material cadastrado com sucesso!\n");
							}
						}
						else if(escolhaCadastro == 3) {
							String nome;
							int qntd;
							System.out.println("Cadastro de material limpeza:");
							System.out.println("Escreva o nome do material limpeza:");
							nome = ler.nextLine();
							int i = 0;
							for(MaterialLimpeza limpezas: listaMatL) {
								if(nome.equals(limpezas.getNome())) {
									System.out.println("Material já cadastrado.");
									i++;
									break;
								}
							}
							if(i != 0) {
								break;
							}
							else {
							System.out.println("Escreva a quantidade a ser adicionado desse material:"); 
							qntd = ler.nextInt();
							MaterialLimpeza limpeza =new MaterialLimpeza(nome, qntd);
							listaMatL.add(limpeza);
							System.out.println("Material cadastrado com sucesso!\n");
							}
						}
				}
				}
			}
			}
			else if(escolhaMenu == 2) {
				int escolhaAtualizar = 0;
				while (escolhaAtualizar != 3) {
					System.out.println("Escolha o Tipo de Alteração:");
					System.out.println("1. Por Recurso Humano");
					System.out.println("2. Por Recurso Material");
					System.out.println("3. Voltar ao Menu inicial");
					escolhaAtualizar = ler.nextInt();
					ler.nextLine();
				
					if(escolhaAtualizar == 1) {
						int escolhaAtualizarH = 0;
						while (escolhaAtualizarH != 7) {
							System.out.println("Escolha o Recurso Humano a ser alterado:");
							System.out.println("1. Aluno(a)");
							System.out.println("2. Cozinheiro(a)");
							System.out.println("3. Instrutor(a)");
							System.out.println("4. Monitor(a)");
							System.out.println("5. Professor(a)");
							System.out.println("6. Servente");
							System.out.println("7. Voltar ao menu anterior");
							escolhaAtualizarH = ler.nextInt();
							ler.nextLine();
							if(escolhaAtualizarH == 1) {
								Alunos aluno = new Alunos();
								if(listaAlunos.size() == 0) {
									System.out.println("Não existem alunos(as) cadastrados.");		
								}
								else {
									System.out.println("Digite o ID do aluno(a) a ser alterado:");
									aluno.setNome(ler.nextLine());
									int ID = aluno.getId();
									int i = 0;
									for(Alunos alunos: listaAlunos) {
										if(ID == alunos.getId()) {
											System.out.println("Digite o novo nome do aluno(a)");
											alunos.setNome(ler.nextLine());
											break;
										} else if(!(ID == alunos.getId()) && i == listaAlunos.size()-1){
											System.out.println("\nNão existe cadastro desse aluno(a) no sistema.\n");
										}
										i++;
									}
								}
							}
							else if(escolhaAtualizarH == 2) {
								Cozinheiros cozinheiro = new Cozinheiros();
								if(listaCozinheiros.size() == 0) {
									System.out.println("Não existem cozinheiros(as) cadastrados.");		
								}
								else {
									System.out.println("Digite o ID do cozinheiro(a) a ser alterado:");
									cozinheiro.setNome(ler.nextLine());
									int ID = cozinheiro.getId();
									int i = 0;
									for(Cozinheiros cozinheiros: listaCozinheiros) {
										if(ID==cozinheiros.getId())) {
											System.out.println("Digite o novo nome do cozinheiro(a)");
											cozinheiros.setNome(ler.nextLine());
											break;
										} else if(!(ID==cozinheiros.getId()) && i == listaCozinheiros.size()-1){
											System.out.println("\nNão existe cadastro desse cozinheiro(a) no sistema.\n");
										}
										i++;
									}
								}
							}
							else if(escolhaAtualizarH == 3) {
								Instrutores instrutor = new Instrutores();
								if(listaInstrutores.size() == 0) {
									System.out.println("Não existem instrutores(as) cadastrados.");		
								}
								else {
									System.out.println("Digite o ID do instrutor(a) a ser alterado:");
									instrutor.setNome(ler.nextLine());
									int ID = instrutor.getId();
									int i = 0;
									for(Instrutores instrutores: listaInstrutores) {
										if(ID==instrutores.getId())) {
											System.out.println("Digite o novo nome do instrutor(a)");
											instrutores.setNome(ler.nextLine());
											break;
										} else if(!(ID==instrutores.getId()) && i == listaInstrutores.size()-1){
											System.out.println("\nNão existe cadastro desse instrutor(a) no sistema.\n");
										}
										i++;
									}
								}
							}
							else if(escolhaAtualizarH == 4) {
								Monitores monitor = new Monitores();
								if(listaMonitores.size() == 0) {
									System.out.println("Não existem monitores(as) cadastrados.");		
								}
								else {
									System.out.println("Digite o ID do monitor(a) a ser alterado:");
									monitor.setNome(ler.nextLine());
									int ID = monitor.getId();
									int i = 0;
									for(Monitores monitores: listaMonitores) {
										if(ID==monitores.getId())) {
											System.out.println("Digite o novo nome do monitor(a)");
											monitores.setNome(ler.nextLine());
											break;
										} else if(!(ID==monitores.getId()) && i == listaMonitores.size()-1){
											System.out.println("\nNão existe cadastro desse monitor(a) no sistema.\n");
										}
										i++;
									}
								}
							}
							else if(escolhaAtualizarH == 5) {
								Professores professor = new Professores();
								if(listaProfessores.size() == 0) {
									System.out.println("Não existem professores(as) cadastrados.");		
								}
								else {
									System.out.println("Digite o ID do professor(a) a ser alterado:");
									professor.setNome(ler.nextLine());
									int ID = professor.getId();
									int i = 0;
									for(Professores professores: listaProfessores) {
										if(ID==professores.getId())) {
											System.out.println("Digite o novo nome do professor(a)");
											professores.setNome(ler.nextLine());
											break;
										} else if(!(ID==professores.getId()) && i == listaProfessores.size()-1){
											System.out.println("\nNão existe cadastro desse professor(a) no sistema.\n");
										}
										i++;
									}
								}
							}
							else if(escolhaAtualizarH == 6) {
								Serventes servente = new Serventes();
								if(listaServentes.size() == 0) {
									System.out.println("Não existem serventes(as) cadastrados.\n");		
								}
								else {
									System.out.println("Digite o ID do servente(a) a ser alterado:");
									servente.setNome(ler.nextLine());
									int ID = servente.getId();
									int i = 0;
									for(Serventes serventes: listaServentes) {
										if(ID==serventes.getId())) {
											System.out.println("Digite o novo nome do servente");
											serventes.setNome(ler.nextLine());
											break;
										} else if(!(ID==serventes.getId()) && i == listaServentes.size()-1){
											System.out.println("\nNão existe cadastro desse servente no sistema.\n");
										}
										i++;
									}
								}
							}
							}
			}
					else if(escolhaAtualizar == 2) {
						int escolhaAtualizarM = 0;
						while (escolhaAtualizarM != 4) {
							System.out.println("Escolha o Recurso material a ser alterado:");
							System.out.println("1. Material Didatico");
							System.out.println("2. Material Escolar");
							System.out.println("3. Material de Limpeza");
							System.out.println("4. Voltar ao menu anterior");
							escolhaAtualizarM = ler.nextInt();
							ler.nextLine();
							if(escolhaAtualizarM == 1) {
								String nome;
								System.out.println("Escreva o nome do material didatico a ser alterado:");
								nome = ler.nextLine();
								int i = 0;
								int j = 0;
								for(MaterialDidatico didaticos: listaMatD) {
									if(nome.equals(didaticos.getNome())) {
										System.out.println("Digite o novo nome do material:");
										didaticos.setNome(ler.nextLine());
										System.out.println("Escreva a quantidade a ser adicionado desse material:"); 
										didaticos.setQntd(ler.nextInt());
										i++;
										break;
									}else if(!nome.equals(didaticos.getNome()) && i == listaMatD.size()-1){
										System.out.println("\nNão existe cadastro desse material no sistema.\n");
									}
									j++;
								}
								}
							else if(escolhaAtualizarM == 2) {
								String nome;
								System.out.println("Escreva o nome do material escolar a ser alterado:");
								nome = ler.nextLine();
								int i = 0;
								int j = 0;
								for(MaterialEscolar escolares: listaMatE) {
									if(nome.equals(escolares.getNome())) {
										System.out.println("Digite o novo nome do material:");
										escolares.setNome(ler.nextLine());
										System.out.println("Escreva a quantidade a ser adicionado desse material:"); 
										escolares.setQntd(ler.nextInt());
										i++;
										break;
									}else if(!nome.equals(escolares.getNome()) && i == listaMatE.size()-1){
										System.out.println("\nNão existe cadastro desse material no sistema.\n");
									}
									j++;
								}
								}
							else if(escolhaAtualizarM == 3) {
								String nome;
								System.out.println("Escreva o nome do material de limpeza a ser alterado:");
								nome = ler.nextLine();
								int i = 0;
								int j = 0;
								for(MaterialLimpeza limpezas: listaMatL) {
									if(nome.equals(limpezas.getNome())) {
										System.out.println("Digite o novo nome do material:");
										limpezas.setNome(ler.nextLine());
										System.out.println("Escreva a quantidade a ser adicionado desse material:"); 
										limpezas.setQntd(ler.nextInt());
										i++;
										break;
									}else if(!nome.equals(limpezas.getNome()) && i == listaMatL.size()-1){
										System.out.println("\nNão existe cadastro desse material no sistema.\n");
									}
									j++;
								}
								}
							}
							
						
					}
					}
				}
			else if(escolhaMenu == 3) {
				int escolhaRemover = 0;
				while (escolhaRemover != 3) {
					System.out.println("Escolha o Tipo de Consulta:");
					System.out.println("1. Por Recurso Humano");
					System.out.println("2. Por Recurso Material");
					System.out.println("3. Voltar ao Menu");
					escolhaRemover = ler.nextInt();
					ler.nextLine();
					if(escolhaRemover == 1) {
						int escolhaRemoverH = 0;
						while (escolhaRemoverH != 7) {
							System.out.println("Escolha o Recurso Humano a ser consultado:");
							System.out.println("1. Aluno(a)");
							System.out.println("2. Cozinheiro(a)");
							System.out.println("3. Instrutor(a)");
							System.out.println("4. Monitor(a)");
							System.out.println("5. Professor(a)");
							System.out.println("6. Servente");
							System.out.println("7. Voltar ao menu anterior");
							escolhaRemoverH = ler.nextInt();
							ler.nextLine();
							
							if(escolhaRemoverH == 1) {
								Alunos aluno = new Alunos();
								if(listaAlunos.size() == 0) {
									System.out.println("Não existem alunos(as) cadastrados.");		
								}
								else {
									System.out.println("Digite o ID do aluno(a) a ser consultado:");
									aluno.setNome(ler.nextInt());
									int ID = aluno.getId();
									int i = 0;
									for(Alunos alunos: listaAlunos) {
										if((ID==alunos.getId())) {
											listaAlunos.remove(alunos);
											numAlunos--;
											numHumanos--;
											System.out.println("Removido com sucesso.");
											break;
										}else if(!(ID==alunos.getId()) && i == listaAlunos.size()-1){
											System.out.println("\nNão existe cadastro desse aluno(a) no sistema.\n");
										}
										i++;
									}
								}
							}
							else if(escolhaRemoverH == 2) {
								Cozinheiros cozinheiro = new Cozinheiros();
								if(listaCozinheiros.size() == 0) {
									System.out.println("Não existem cozinheiros(as) cadastrados.");		
								}
								else {
									System.out.println("Digite o ID do cozinheiro(a) a ser consultado:");
									cozinheiro.setNome(ler.nextInt());
									int ID = cozinheiro.getId();
									int i = 0;
									for(Cozinheiros cozinheiros: listaCozinheiros) {
										if((ID==cozinheiros.getId())) {
											listaCozinheiros.remove(cozinheiros);
											numAlunos--;
											numHumanos--;
											System.out.println("Removido com sucesso.");
											break;
										} else if(!(ID==cozinheiros.getId()) && i == listaCozinheiros.size()-1){
											System.out.println("\nNão existe cadastro desse cozinheiro(a) no sistema.\n");
										}
										i++;
									}
								}
							}
							else if(escolhaRemoverH == 3) {
								Instrutores instrutor = new Instrutores();
								if(listaInstrutores.size() == 0) {
									System.out.println("Não existem instrutores(as) cadastrados.");		
								}
								else {
									System.out.println("Digite o ID do instrutor(a) a ser consultado:");
									instrutor.setNome(ler.nextInt());
									int ID = instrutor.getId();
									int i = 0;
									for(Instrutores instrutores: listaInstrutores) {
										if((ID==instrutores.getId())) {
											listaInstrutores.remove(instrutores);
											numAlunos--;
											numHumanos--;
											System.out.println("Removido com sucesso.");
											break;
										} else if(!(ID==instrutores.getId()) && i == listaInstrutores.size()-1){
											System.out.println("\nNão existe cadastro desse instrutor(a) no sistema.\n");
										}
										i++;
									}
								}
							}
							else if(escolhaRemoverH == 4) {
								Monitores monitor = new Monitores();
								if(listaMonitores.size() == 0) {
									System.out.println("Não existem monitores(as) cadastrados.");		
								}
								else {
									System.out.println("Digite o ID do monitor(a) a ser consultado:");
									monitor.setNome(ler.nextInt());
									int ID = monitor.getId();
									int i = 0;
									for(Monitores monitores: listaMonitores) {
										if((ID==monitores.getId())) {
											listaMonitores.remove(monitores);
											numAlunos--;
											numHumanos--;
											System.out.println("Removido com sucesso.");
											break;
										} else if(!(ID==monitores.getId()) && i == listaMonitores.size()-1){
											System.out.println("\nNão existe cadastro desse monitor(a) no sistema.\n");
										}
										i++;
									}
								}
							}
							else if(escolhaRemoverH == 5) {
								Professores professor = new Professores();
								if(listaProfessores.size() == 0) {
									System.out.println("Não existem professores(as) cadastrados.");		
								}
								else {
									System.out.println("Digite o ID do professor(a) a ser consultado:");
									professor.setNome(ler.nextInt());
									int ID = professor.getId();
									int i = 0;
									for(Professores professores: listaProfessores) {
										if((ID==professores.getId())) {
											listaProfessores.remove(professores);
											numAlunos--;
											numHumanos--;
											System.out.println("Removido com sucesso.");
											break;
										} else if(!(ID==professores.getId()) && i == listaProfessores.size()-1){
											System.out.println("\nNão existe cadastro desse professor(a) no sistema.\n");
										}
										i++;
									}
								}
							}
							else if(escolhaRemoverH == 6) {
								Serventes servente = new Serventes();
								if(listaServentes.size() == 0) {
									System.out.println("Não existem serventes(as) cadastrados.");		
								}
								else {
									System.out.println("Digite o ID do servente(a) a ser consultado:");
									servente.setNome(ler.nextInt());
									int ID = servente.getId();
									int i = 0;
									for(Serventes serventes: listaServentes) {
										if((ID==serventes.getId())) {
											listaServentes.remove(serventes);
											numAlunos--;
											numHumanos--;
											System.out.println("Removido com sucesso.");
											break;
										} else if(!(ID==serventes.getId()) && i == listaServentes.size()-1){
											System.out.println("\nNão existe cadastro desse servente no sistema.\n");
										}
										i++;
									}
								}
							}
							
					}
					}
					else if(escolhaRemover == 2) {
						int escolhaRemoverM = 0;
						while (escolhaRemoverM != 4) {
							System.out.println("Escolha o Recurso material a ser cadastrado:");
							System.out.println("1. Material Didatico");
							System.out.println("2. Material Escolar");
							System.out.println("3. Material de Limpeza");
							System.out.println("4. Voltar ao menu anterior");
							escolhaRemoverM = ler.nextInt();
							ler.nextLine();
							if(escolhaRemoverM == 1) {
								String nome;
								System.out.println("Escreva o nome do material didatico a ser alterado:");
								nome = ler.nextLine();
								int i = 0;
								for(MaterialDidatico didaticos: listaMatD) {
									if(nome.equals(didaticos.getNome())) {
										listaMatD.remove(didaticos);
										System.out.println("Removido com sucesso.");
										break;
									}else if(!nome.equals(didaticos.getNome()) && i == listaMatD.size()-1){
										System.out.println("\nNão existe cadastro desse material no sistema.\n");
									}
									i++;
								}
								}
							else if(escolhaRemoverM == 2) {
								String nome;
								System.out.println("Escreva o nome do material escolar a ser alterado:");
								nome = ler.nextLine();
								int i = 0;
								for(MaterialEscolar escolares: listaMatE) {
									if(nome.equals(escolares.getNome())) {
										listaMatE.remove(escolares);
										System.out.println("Removido com sucesso.");
										break;
									}else if(!nome.equals(escolares.getNome()) && i == listaMatE.size()-1){
										System.out.println("\nNão existe cadastro desse material no sistema.\n");
									}
									i++;
								}
								}
							else if(escolhaRemoverM == 3) {
								String nome;
								System.out.println("Escreva o nome do material de limpeza a ser consultado:");
								nome = ler.nextLine();
								int i = 0;
								for(MaterialLimpeza limpezas: listaMatL) {
									if(nome.equals(limpezas.getNome())) {
										listaMatL.remove(limpezas);
										System.out.println("Removido com sucesso.");
										break;
									}else if(!nome.equals(limpezas.getNome()) && i == listaMatL.size()-1){
										System.out.println("\nNão existe cadastro desse material no sistema.\n");
									}
									i++;
								}
								}
					}
					}
			}
			
				
			}
			else if(escolhaMenu == 4) {
				
			}
			else if(escolhaMenu == 5) {
				int escolhaConsulta = 0;
				while (escolhaConsulta != 3) {
					System.out.println("Escolha o Tipo de Consulta:");
					System.out.println("1. Por Recurso Humano");
					System.out.println("2. Por Recurso Material");
					System.out.println("3. Voltar ao Menu");
					escolhaConsulta = ler.nextInt();
					ler.nextLine();
					if(escolhaConsulta == 1) {
						int escolhaConsultaH = 0;
						while (escolhaConsultaH != 7) {
							System.out.println("Escolha o Recurso Humano a ser consultado:");
							System.out.println("1. Aluno(a)");
							System.out.println("2. Cozinheiro(a)");
							System.out.println("3. Instrutor(a)");
							System.out.println("4. Monitor(a)");
							System.out.println("5. Professor(a)");
							System.out.println("6. Servente");
							System.out.println("7. Voltar ao menu anterior");
							escolhaConsultaH = ler.nextInt();
							ler.nextLine();
							
							if(escolhaConsultaH == 1) {
								Alunos aluno = new Alunos();
								if(listaAlunos.size() == 0) {
									System.out.println("Não existem alunos(as) cadastrados.");		
								}
								else {
									System.out.println("Digite o ID do aluno(a) a ser consultado:");
									aluno.setNome(ler.nextInt());
									int ID = aluno.getId();
									int i = 0;
									for(Alunos alunos: listaAlunos) {
										if(ID==alunos.getId()) {
											System.out.println("Nome: "+ alunos.getNome());
											break;
										}else if(!(ID==alunos.getId()) && i == listaAlunos.size()-1){
											System.out.println("\nNão existe cadastro desse aluno(a) no sistema.\n");
										}
										i++;
									}
								}
							}
							else if(escolhaConsultaH == 2) {
								Cozinheiros cozinheiro = new Cozinheiros();
								if(listaCozinheiros.size() == 0) {
									System.out.println("Não existem cozinheiros(as) cadastrados.");		
								}
								else {
									System.out.println("Digite o ID do cozinheiro(a) a ser consultado:");
									cozinheiro.setNome(ler.nextInt());
									int ID = cozinheiro.getId();
									int i = 0;
									for(Cozinheiros cozinheiros: listaCozinheiros) {
										if(ID==(cozinheiros.getId())) {
											System.out.println("Nome: "+ cozinheiros.getNome());
											break;
										} else if(!(ID==cozinheiros.getId()) && i == listaCozinheiros.size()-1){
											System.out.println("\nNão existe cadastro desse cozinheiro(a) no sistema.\n");
										}
										i++;
									}
								}
							}
							else if(escolhaConsultaH == 3) {
								Instrutores instrutor = new Instrutores();
								if(listaInstrutores.size() == 0) {
									System.out.println("Não existem instrutores(as) cadastrados.");		
								}
								else {
									System.out.println("Digite o ID do instrutor(a) a ser consultado:");
									instrutor.setNome(ler.nextInt());
									int ID = instrutor.getId();
									int i = 0;
									for(Instrutores instrutores: listaInstrutores) {
										if(ID==instrutores.getId()) {
											System.out.println("Nome: "+ instrutores.getNome());
											break;
										} else if(!(ID==instrutores.getId()) && i == listaInstrutores.size()-1){
											System.out.println("\nNão existe cadastro desse instrutor(a) no sistema.\n");
										}
										i++;
									}
								}
							}
							else if(escolhaConsultaH == 4) {
								Monitores monitor = new Monitores();
								if(listaMonitores.size() == 0) {
									System.out.println("Não existem monitores(as) cadastrados.");		
								}
								else {
									System.out.println("Digite o ID do monitor(a) a ser consultado:");
									monitor.setNome(ler.nextInt());
									int ID = monitor.getId();
									int i = 0;
									for(Monitores monitores: listaMonitores) {
										if(ID==monitores.getId()) {
											System.out.println("Nome: "+ monitores.getNome());
											break;
										} else if(!(ID==monitores.getId()) && i == listaMonitores.size()-1){
											System.out.println("\nNão existe cadastro desse monitor(a) no sistema.\n");
										}
										i++;
									}
								}
							}
							else if(escolhaConsultaH == 5) {
								Professores professor = new Professores();
								if(listaProfessores.size() == 0) {
									System.out.println("Não existem professores(as) cadastrados.");		
								}
								else {
									System.out.println("Digite o ID do professor(a) a ser consultado:");
									professor.setNome(ler.nextInt());
									int ID = professor.getId();
									int i = 0;
									for(Professores professores: listaProfessores) {
										if(ID==professores.getId()) {
											System.out.println("Nome: "+ professores.getNome());
											break;
										} else if(!(ID==professores.getId()) && i == listaProfessores.size()-1){
											System.out.println("\nNão existe cadastro desse professor(a) no sistema.\n");
										}
										i++;
									}
								}
							}
							else if(escolhaConsultaH == 6) {
								Serventes servente = new Serventes();
								if(listaServentes.size() == 0) {
									System.out.println("Não existem serventes(as) cadastrados.");		
								}
								else {
									System.out.println("Digite o ID do servente(a) a ser consultado:");
									servente.setNome(ler.nextInt());
									int ID = servente.getId();
									int i = 0;
									for(Serventes serventes: listaServentes) {
										if(ID==serventes.getId()) {
											System.out.println("Nome: "+ serventes.getNome());
											break;
										} else if(!(ID==serventes.getId()) && i == listaServentes.size()-1){
											System.out.println("\nNão existe cadastro desse servente no sistema.\n");
										}
										i++;
									}
								}
							}
							
					}
					}
					else if(escolhaConsulta == 2) {
						int escolhaConsultaM = 0;
						while (escolhaConsultaM != 4) {
							System.out.println("Escolha o Recurso material a ser cadastrado:");
							System.out.println("1. Material Didatico");
							System.out.println("2. Material Escolar");
							System.out.println("3. Material de Limpeza");
							System.out.println("4. Voltar ao menu anterior");
							escolhaConsultaM = ler.nextInt();
							ler.nextLine();
							if(escolhaConsultaM == 1) {
								String nome;
								System.out.println("Escreva o nome do material didatico a ser alterado:");
								nome = ler.nextLine();
								int i = 0;
								for(MaterialDidatico didaticos: listaMatD) {
									if(nome.equals(didaticos.getNome())) {
										System.out.println("Nome do material:");
										didaticos.getNome();
										System.out.println("Quantidade desse material:"); 
										didaticos.getQntd();
										break;
									}else if(!nome.equals(didaticos.getNome()) && i == listaMatD.size()-1){
										System.out.println("\nNão existe cadastro desse material no sistema.\n");
									}
									i++;
								}
								}
							else if(escolhaConsultaM == 2) {
								String nome;
								System.out.println("Escreva o nome do material escolar a ser alterado:");
								nome = ler.nextLine();
								int i = 0;
								for(MaterialEscolar escolares: listaMatE) {
									if(nome.equals(escolares.getNome())) {
										System.out.println("Nome do material:");
										escolares.getNome();
										System.out.println("Quantidade desse material:"); 
										escolares.getQntd();
										break;
									}else if(!nome.equals(escolares.getNome()) && i == listaMatE.size()-1){
										System.out.println("\nNão existe cadastro desse material no sistema.\n");
									}
									i++;
								}
								}
							else if(escolhaConsultaM == 3) {
								String nome;
								System.out.println("Escreva o nome do material de limpeza a ser consultado:");
								nome = ler.nextLine();
								int i = 0;

								for(MaterialLimpeza limpezas: listaMatL) {
									if(nome.equals(limpezas.getNome())) {
										System.out.println("Nome do material:");
										limpezas.getNome();
										System.out.println("Quantidade desse material:"); 
										limpezas.getQntd();
										break;
									}else if(!nome.equals(limpezas.getNome()) && i == listaMatL.size()-1){
										System.out.println("\nNão existe cadastro desse material no sistema.\n");
									}
									i++;
								}
								}
					}
					}
			}
			}
			else if(escolhaMenu == 6) {
				System.out.println("Número de recursos humanos: "+numHumanos );
				System.out.println("Número de cozinheiros: "+numCozinheiros );
				System.out.println("Número de Instrutores: "+numInstrutores );
				System.out.println("Número de Monitores: "+numMonitores );
				System.out.println("Número de Professores: "+numProfessores );
				System.out.println("Número de Serventes: "+numServentes );
				for(MaterialDidatico didaticos: listaMatD) {
					System.out.println("Nome do recurso material: "+didaticos.getNome() 
					+"\nQuantidade desse recurso: "+didaticos.getQntd() );
				}
				for(MaterialEscolar escolares: listaMatE) {
					System.out.println("Nome do recurso material: "+escolares.getNome() 
					+"\nQuantidade desse recurso: "+escolares.getQntd() );
				}
				for(MaterialLimpeza limpezas: listaMatL) {
					System.out.println("Nome do recurso material: "+limpezas.getNome() 
					+"\nQuantidade desse recurso: "+limpezas.getQntd() );
				}
			}
		
	}
		ler.close();
		}
		}
	

