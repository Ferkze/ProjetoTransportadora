/*
	--Base de Dados
*/
	--Criar Banco
	--CREATE DATABASE db_ProjetoTranspotadora;
	USE db_ProjetoTranspotadora;

	--sp_help tbl_CTRCs

	


	--Criar Tabelas
CREATE TABLE tbl_Veiculos (
IdVeiculo INT PRIMARY KEY IDENTITY(1,1),
dsVeiculo VARCHAR(50) NOT NULL, -- Obrigat�rio
nrPlaca_Veiculo VARCHAR(10) NOT NULL

);
	

CREATE TABLE tbl_Manifestos (
IdManifesto INT PRIMARY KEY IDENTITY(1,1)NOT NULL,
nrPlaca_Veiculo VARCHAR(8) NOT NULL,
nmFilial_Origem VARCHAR(50) NOT NULL,
nmFilial_Destino VARCHAR(50) NOT NULL

);


CREATE TABLE tbl_Motoristas (
IdMotorista INT PRIMARY KEY IDENTITY(1,1),
nmMotorista VARCHAR(50) NOT NULL,
dtNascimento DATE,
icSexo VARCHAR(1) NOT NULL,
nmTelefone VARCHAR(15) NOT NULL

);


CREATE TABLE tbl_Clientes_Reme (
IdCli_Reme INT PRIMARY KEY IDENTITY(1,1),
nmCli_Rementente VARCHAR(50) NOT NULL,
nmEndereco VARCHAR(50) NOT NULL,
nmCidade VARCHAR(50)NOT NULL,
nmUF VARCHAR(30) NOT NULL,
cnpjCliente VARCHAR(14),
cpfCliente VARCHAR(11),
nmTelefone VARCHAR(15) NOT NULL

);


CREATE TABLE tbl_Clientes_Dest (
IdCli_Dest INT PRIMARY KEY IDENTITY(1,1),
nmCli_Destinatario  VARCHAR(50) NOT NULL,
nmEndereco VARCHAR(50) NOT NULL,
nmCidade VARCHAR(50)NOT NULL,
nmUF VARCHAR(30) NOT NULL,
cnpjCliente VARCHAR(14),
cpfCliente VARCHAR(11),
nmTelefone VARCHAR(15) NOT NULL

);


CREATE TABLE tbl_CTRCs(
IdCtrc INT PRIMARY KEY IDENTITY(1,1),
nmCli_Rementente VARCHAR(50) NOT NULL,
nmCli_Destinatario  VARCHAR(50) NOT NULL,
dtEmissao DATE NOT NULL,
qtPesoFrete INT NOT NULL,
vlFrete MONEY 

);


CREATE TABLE tbl_CTRCs_Manifestos (
IdCtrcManifesto INT PRIMARY KEY IDENTITY(1,1)NOT NULL,
nmMotorista VARCHAR(50) NOT NULL,
nrPlaca_Veiculo VARCHAR(8) NOT NULL,
nmFilial_Origem VARCHAR(50) NOT NULL,
nmFilial_Destino VARCHAR(50) NOT NULL,
nmCli_Rementente VARCHAR(50) NOT NULL,
nmCli_Destinatario  VARCHAR(50) NOT NULL,
qtPesoFrete INT NOT NULL,
vlFrete MONEY,
IdMotorista INT FOREIGN KEY REFERENCES tbl_Motoristas(IdMotorista) NOT NULL,
IdVeiculo INT FOREIGN KEY REFERENCES tbl_Veiculos(IdVeiculo) NOT NULL,
IdManifesto INT FOREIGN KEY REFERENCES tbl_Manifestos (IdManifesto) NOT NULL,
IdCli_Reme INT FOREIGN KEY REFERENCES tbl_Clientes_Reme(IdCli_Reme) NOT NULL,
IdCli_Dest INT FOREIGN KEY REFERENCES tbl_Clientes_Dest(IdCli_Dest) NOT NULL,
IdCtrc INT FOREIGN KEY REFERENCES tbl_CTRCs (IdCtrc) NOT NULL

);




	


	--Inserir Veiculos

	-- DELETE tbl_Veiculos WHERE IdVeiculo>'0'
	-- SELECT * FROM tbl_Veiculos

	INSERT INTO tbl_Veiculos (dsVeiculo, nrPlaca_Veiculo) VALUES ('VolksWagem', 'AAA-1111')
	INSERT INTO tbl_Veiculos (dsVeiculo, nrPlaca_Veiculo) VALUES ('Volvo', 'BBA-2222')
	INSERT INTO tbl_Veiculos (dsVeiculo, nrPlaca_Veiculo) VALUES ('Mercedes Benz', 'CCA-3333')
	INSERT INTO tbl_Veiculos (dsVeiculo, nrPlaca_Veiculo) VALUES ('Mercedes Benz', 'DDA-4444')
	INSERT INTO tbl_Veiculos (dsVeiculo, nrPlaca_Veiculo) VALUES ('VolksWagem', 'EEA-5555')



	--Inserir Motoristas

	-- DELETE tbl_Motoristas WHERE IdMotorista>'0'
	-- SELECT * FROM tbl_Motoristas

	INSERT INTO tbl_Motoristas(nmMotorista, dtNascimento, icSexo, nmTelefone) VALUES ('Jo�o da Silva', '1958-05-30', 'M', '(021)94444-3333')
	INSERT INTO tbl_Motoristas(nmMotorista, dtNascimento, icSexo, nmTelefone) VALUES ('Maria do Luz', '1965-10-05', 'F', '(011)95544-4444')
	INSERT INTO tbl_Motoristas(nmMotorista, dtNascimento, icSexo, nmTelefone) VALUES ('Fernando Gois', '1982-04-04', 'M', '(016)96644-5555')
	INSERT INTO tbl_Motoristas(nmMotorista, dtNascimento, icSexo, nmTelefone) VALUES ('M�rcia Feliz', '1975-11-28', 'F', '(035)97744-6666')
	INSERT INTO tbl_Motoristas(nmMotorista, dtNascimento, icSexo, nmTelefone) VALUES ('Marcos Rueda', '1970-11-05', 'M', '(035)98888-7777')


	--Inserir Manifestos

	-- DELETE tbl_Manifestos WHERE IdManifesto>'0'
	-- SELECT * FROM tbl_Manifestos

	INSERT INTO tbl_Manifestos(nrPlaca_Veiculo, nmFilial_Origem, nmFilial_Destino) VALUES ('AAA-1111', 'CD Santos','CD Cotia')
	INSERT INTO tbl_Manifestos(nrPlaca_Veiculo, nmFilial_Origem, nmFilial_Destino) VALUES ('BBA-2222', 'CD Minas Gerais','CD Aracaju')
	INSERT INTO tbl_Manifestos(nrPlaca_Veiculo, nmFilial_Origem, nmFilial_Destino) VALUES ('CCC-3333', 'CD Minas Gerais','CD S�o Paulo')
	INSERT INTO tbl_Manifestos(nrPlaca_Veiculo, nmFilial_Origem, nmFilial_Destino) VALUES ('DDD-4444', 'CD S�o Paulo','CD Bahia')
	INSERT INTO tbl_Manifestos(nrPlaca_Veiculo, nmFilial_Origem, nmFilial_Destino) VALUES ('EEE-5555', 'CD Santos','CD Rio de Janeiro')


	-- Inserir CTRCs

	-- DELETE tbl_CTRCs WHERE IdCtrc>'0'
	-- SELECT * FROM tbl_CTRCs

	--Formatando Moedas
	--Formatando Datas
	--SELECT nmCli_Rementente, nmCli_Destinatario, dtEmissao, qtPesoFrete, FORMAT  (vlFrete,'c', 'pt-br') AS vlFrete FROM tbl_CTRCs
	--SELECT nmCli_Rementente, nmCli_Destinatario, qtPesoFrete,vlFrete, FORMAT (dtEmissao,'d', 'pt-br') AS dtEmissao FROM tbl_CTRCs
 
	INSERT INTO tbl_CTRCs(nmCli_Rementente, nmCli_Destinatario, dtEmissao, qtPesoFrete, vlFrete) VALUES ('Pescados SP', 'Hipermercado Extra','2019-06-11','5000', '3750')
	INSERT INTO tbl_CTRCs(nmCli_Rementente, nmCli_Destinatario, dtEmissao, qtPesoFrete, vlFrete) VALUES ('Min�rios Ouro', 'Lapidadora Sergipe','2019-01-11','3950','12750')
	INSERT INTO tbl_CTRCs(nmCli_Rementente, nmCli_Destinatario, dtEmissao, qtPesoFrete, vlFrete) VALUES ('Latic�nios da Vov�', 'Distribuidora S�o Jo�o','2019-12-13','3000', '5300')
	INSERT INTO tbl_CTRCs(nmCli_Rementente, nmCli_Destinatario, dtEmissao, qtPesoFrete, vlFrete) VALUES ('Autometal', 'Auto Pe�as Kabum','2019-03-11', '5000', '9750')
	INSERT INTO tbl_CTRCs(nmCli_Rementente, nmCli_Destinatario, dtEmissao, qtPesoFrete, vlFrete) VALUES ('Eletr�nicos SA', 'BIG Cell','2019-07-01', '900', '9310')


	-- Inserir Clientes_Remetente

	-- DELETE tbl_Clientes_Reme WHERE IdCli_Reme>'0'
	-- SELECT * FROM tbl_Clientes_Reme


	
	INSERT INTO tbl_Clientes_Reme(nmCli_Rementente,nmEndereco,nmCidade,nmUF,cnpjCliente, cpfCliente, nmTelefone) VALUES ('Pescados SP', 'Rua Joaquim Silva, 375-Bairro do Lim�o', 'S�o Paulo', 'SP', '77551122000170', '', '(11) 2260-2780')
	INSERT INTO tbl_Clientes_Reme(nmCli_Rementente,nmEndereco,nmCidade,nmUF,cnpjCliente, cpfCliente, nmTelefone) VALUES ('Min�rios Ouro', 'Rua Silva Jardim, 115-Bairro Tr�s Marias', 'Extrema', 'MG', '88443311000171', '', '(35) 2233-2781')
	INSERT INTO tbl_Clientes_Reme(nmCli_Rementente,nmEndereco,nmCidade,nmUF,cnpjCliente, cpfCliente, nmTelefone) VALUES ('Latic�nios da Vov�', 'Rua Presidente Kennedy,1000 - Centro', 'Extrema', 'MG', '33557788000172', '', '(35) 4422-2782')
	INSERT INTO tbl_Clientes_Reme(nmCli_Rementente,nmEndereco,nmCidade,nmUF,cnpjCliente, cpfCliente, nmTelefone) VALUES ('Autometal', 'Rod. Anchieta, 1375-Centro','S�o Paulo', 'SP', '44335522000173', '', '(11) 5522-2783')
	INSERT INTO tbl_Clientes_Reme(nmCli_Rementente,nmEndereco,nmCidade,nmUF,cnpjCliente, cpfCliente, nmTelefone) VALUES ('Eletr�nicos SA', 'Rua Caminho do Mar, 6670-Bairro Sa�de', 'Santos', 'SP', '55443311000174', '', '(13) 5566-2784')

	

	-- Inserir Clientes_Destinat�rio

	-- DELETE tbl_Clientes_Dest WHERE IdCli_Dest>'0'
	-- SELECT * FROM tbl_Clientes_Dest
	
	


	INSERT INTO tbl_Clientes_Dest(nmCli_Destinatario,nmEndereco,nmCidade,nmUF,cnpjCliente, cpfCliente, nmTelefone) VALUES ('Hipermercado Extra', 'Rua Maria da Penha, 3000-Centro', 'Cotia', 'SP', '22336655000155', '', '(11) 8899-5005')
	INSERT INTO tbl_Clientes_Dest(nmCli_Destinatario,nmEndereco,nmCidade,nmUF,cnpjCliente, cpfCliente, nmTelefone) VALUES ('Lapidadora Sergipe', 'Rua Sol,8700-Bairro das Flores', 'Arau�', 'SE', '', '23165498700', '(79) 2233-4004')
	INSERT INTO tbl_Clientes_Dest(nmCli_Destinatario,nmEndereco,nmCidade,nmUF,cnpjCliente, cpfCliente, nmTelefone) VALUES ('Distribuidora S�o Jo�o', 'Rua Airton Senna, 6500-Bairro Limeira', 'S�o Paulo', 'SP', '22558899000157', '', '(11) 2211-4003')
	INSERT INTO tbl_Clientes_Dest(nmCli_Destinatario,nmEndereco,nmCidade,nmUF,cnpjCliente, cpfCliente, nmTelefone) VALUES ('Auto Peças Kabum', 'Rua Joaquim Nabuco, 37-Bairro Ferraz Alvim', 'Salvador', 'BA', '11447788000158', '', '(11) 7744-3002')
	INSERT INTO tbl_Clientes_Dest(nmCli_Destinatario,nmEndereco,nmCidade,nmUF,cnpjCliente, cpfCliente, nmTelefone) VALUES ('BIG Cell', 'Rua Netuno, 66-Bairro Limp�o', 'Petr�polis', 'RJ', '11223344000159', '', '(21) 6699-3001')




	-- Inserir CTRCs_Manifestos

	-- DELETE tbl_CTRCs_Manifestos WHERE IdCtrcManifesto>'0'
	-- SELECT * FROM tbl_CTRCs_Manifestos

	--Formatando Moedas
	--SELECT nrPlaca_Veiculo, nmFilial_Origem, nmFilial_Destino, nmCli_Rementente, nmCli_Destinatario, qtPesoFrete, FORMAT  (vlFrete,'c', 'pt-br') AS vlFrete FROM tbl_CTRCs_Manifestos
	

	INSERT INTO tbl_CTRCs_Manifestos(nmMotorista, nrPlaca_Veiculo, nmFilial_Origem, nmFilial_Destino, nmCli_Rementente, nmCli_Destinatario, qtPesoFrete, vlFrete,IdMotorista, IdVeiculo,IdManifesto,IdCli_Reme,IdCli_Dest, IdCtrc) VALUES ('Joao da Silva','AAA-1111', 'CD Santos','CD Cotia', 'Pescados SP', 'Hipermercado Extra','5000', '3750',1,1,1,1,1,1)
	INSERT INTO tbl_CTRCs_Manifestos(nmMotorista, nrPlaca_Veiculo, nmFilial_Origem, nmFilial_Destino, nmCli_Rementente, nmCli_Destinatario, qtPesoFrete, vlFrete,IdMotorista, IdVeiculo,IdManifesto,IdCli_Reme,IdCli_Dest, IdCtrc) VALUES ('Maria do Luz,','BBA-2222', 'CD Minas Gerais','CD Aracaju','Minerios Ouro', 'Lapidadora Sergipe','3950','12750',2,2,2,2,2,2)
	INSERT INTO tbl_CTRCs_Manifestos(nmMotorista, nrPlaca_Veiculo, nmFilial_Origem, nmFilial_Destino, nmCli_Rementente, nmCli_Destinatario, qtPesoFrete, vlFrete,IdMotorista, IdVeiculo,IdManifesto,IdCli_Reme,IdCli_Dest, IdCtrc) VALUES ('Fernando Gois','CCC-3333', 'CD Minas Gerais','CD Sao Paulo', 'Laticinios da Vovo', 'Distribuidora Sao João','3000', '5300',3,3,3,3,3,3)
    INSERT INTO tbl_CTRCs_Manifestos(nmMotorista, nrPlaca_Veiculo, nmFilial_Origem, nmFilial_Destino, nmCli_Rementente, nmCli_Destinatario, qtPesoFrete, vlFrete,IdMotorista, IdVeiculo,IdManifesto,IdCli_Reme,IdCli_Dest, IdCtrc) VALUES ('Marcia Feliz','DDD-4444', 'CD Sao Paulo','CD Bahia', 'Autometal', 'Auto Pecas Kabum', '5000', '9750',4,4,4,4,4,4)
	INSERT INTO tbl_CTRCs_Manifestos(nmMotorista, nrPlaca_Veiculo, nmFilial_Origem, nmFilial_Destino, nmCli_Rementente, nmCli_Destinatario, qtPesoFrete, vlFrete,IdMotorista, IdVeiculo,IdManifesto,IdCli_Reme,IdCli_Dest, IdCtrc) VALUES ('Marcos Rueda','EEE-5555', 'CD Santos','CD Rio de Janeiro', 'Eletronicos SA', 'BIG Cell','900', '9310',5,5,5,5,5,5)





	---------------------------------------------------------------------------------------------------------------

