/* -- BASE DE DADOS */

	--Criar Banco
	--CREATE DATABASE db_ProjetoTranspotadora;
	USE db_ProjetoTranspotadora;

	--sp_help tbl_CTRC

	--Criar Tabelas
CREATE TABLE tbl_Veiculo (
	IdVeiculo INT PRIMARY KEY IDENTITY(1,1),
	dsVeiculo VARCHAR(50) NOT NULL,
	nrPlaca_Veiculo VARCHAR(10) NOT NULL

);
	
CREATE TABLE tbl_Manifesto (
	IdManifesto INT PRIMARY KEY IDENTITY(1,1) NOT NULL,
	nmFilial_Origem VARCHAR(50) NOT NULL,
	nmFilial_Destino VARCHAR(50) NOT NULL

);
	
CREATE TABLE tbl_ManifestoVeiculo (
	IdManifestoVeiculo INT PRIMARY KEY IDENTITY(1,1) NOT NULL,
	IdManifesto INT FOREIGN KEY REFERENCES tbl_Manifesto(IdManifesto) NOT NULL,
	IdVeiculo INT FOREIGN KEY REFERENCES tbl_Veiculo(IdVeiculo) NOT NULL
);

CREATE TABLE tbl_Motorista (
	IdMotorista INT PRIMARY KEY IDENTITY(1,1),
	nome VARCHAR(50) NOT NULL,
	sexo CHAR(1) NOT NULL,
	telefone VARCHAR(15) NULL,
	IdAjudante INT FOREIGN KEY REFERENCES tbl_Motorista(IdMotorista) NULL
);

CREATE TABLE tbl_Cliente (
	IdCliente INT PRIMARY KEY IDENTITY(1,1),
	nome VARCHAR(50) NOT NULL,
	endereco VARCHAR(50) NOT NULL,
	cidade VARCHAR(50)NOT NULL,
	uf VARCHAR(30) NOT NULL,
	telefone VARCHAR(15) NULL,
	cnpj VARCHAR(14) NULL,
	tipo_organizacao VARCHAR(30) NULL,
	cpf VARCHAR(11) NULL,
	sexo CHAR(1) NULL

);

CREATE TABLE tbl_CTRC (
	IdCtrc INT PRIMARY KEY IDENTITY(1,1),
	IdClienteReme INT FOREIGN KEY REFERENCES tbl_Cliente (IdCliente) NOT NULL,
	IdClienteDest INT FOREIGN KEY REFERENCES tbl_Cliente (IdCliente) NOT NULL,
	IdMotorista INT FOREIGN KEY REFERENCES tbl_Motorista (IdMotorista) NOT NULL,
	dtEmissao DATE NOT NULL,
	qtPesoFrete INT NOT NULL,
	vlFrete MONEY 

);

CREATE TABLE tbl_CTRCManifesto (
	IdCtrcManifesto INT PRIMARY KEY IDENTITY(1,1)NOT NULL,
	IdManifesto INT FOREIGN KEY REFERENCES tbl_Manifesto (IdManifesto) NOT NULL,
	IdCtrc INT FOREIGN KEY REFERENCES tbl_CTRC (IdCtrc) NOT NULL
);

	--Inserir Veiculos

	-- DELETE tbl_Veiculo WHERE IdVeiculo>'0'
	-- SELECT * FROM tbl_Veiculo

INSERT INTO tbl_Veiculo (dsVeiculo, nrPlaca_Veiculo) VALUES ('VolksWagem', 'AAA-1111');
INSERT INTO tbl_Veiculo (dsVeiculo, nrPlaca_Veiculo) VALUES ('Volvo', 'BBA-2222');
INSERT INTO tbl_Veiculo (dsVeiculo, nrPlaca_Veiculo) VALUES ('Mercedes Benz', 'CCA-3333');
INSERT INTO tbl_Veiculo (dsVeiculo, nrPlaca_Veiculo) VALUES ('Mercedes Benz', 'DDA-4444');
INSERT INTO tbl_Veiculo (dsVeiculo, nrPlaca_Veiculo) VALUES ('VolksWagem', 'EEA-5555');

	--Inserir Motoristas

	-- DELETE tbl_Motorista WHERE IdMotorista>'0'
	-- SELECT * FROM tbl_Motorista

INSERT INTO tbl_Motorista (nome, sexo, telefone) VALUES ('João da Silva', 'M', '(021)94444-3333');
INSERT INTO tbl_Motorista (nome, sexo, telefone) VALUES ('Maria do Luz', 'F', '(011)95544-4444');
INSERT INTO tbl_Motorista (nome, sexo, telefone) VALUES ('Fernando Gois', 'M', '(016)96644-5555');
INSERT INTO tbl_Motorista (nome, sexo, telefone) VALUES ('Márcia Feliz', 'F', '(035)97744-6666');
INSERT INTO tbl_Motorista (nome, sexo, telefone) VALUES ('Marcos Rueda', 'M', '(035)98888-7777');

	--Inserir Manifestos

	-- DELETE tbl_Manifesto WHERE IdManifesto>'0'
	-- SELECT * FROM tbl_Manifesto

INSERT INTO tbl_Manifesto (IdVeiculo, nmFilial_Origem, nmFilial_Destino) VALUES (1, 'CD Santos','CD Cotia');
INSERT INTO tbl_Manifesto (IdVeiculo, nmFilial_Origem, nmFilial_Destino) VALUES (2, 'CD Minas Gerais','CD Aracaju');
INSERT INTO tbl_Manifesto (IdVeiculo, nmFilial_Origem, nmFilial_Destino) VALUES (3, 'CD Minas Gerais','CD São Paulo');
INSERT INTO tbl_Manifesto (IdVeiculo, nmFilial_Origem, nmFilial_Destino) VALUES (4, 'CD São Paulo','CD Bahia');
INSERT INTO tbl_Manifesto (IdVeiculo, nmFilial_Origem, nmFilial_Destino) VALUES (5, 'CD Santos','CD Rio de Janeiro');

	-- Inserir Cliente

	-- DELETE tbl_Cliente WHERE IdCliente>'0'
	-- SELECT * FROM tbl_Cliente

INSERT INTO tbl_Cliente(nome, endereco, cidade, uf, cnpj, tipo_organizacao, telefone) VALUES ('Hipermercado Extra', 'Rua Maria da Penha, 3000-Centro', 'Cotia', 'SP', '22336655000155', '','(11) 8899-5005');
INSERT INTO tbl_Cliente(nome, endereco, cidade, uf, cnpj, tipo_organizacao, telefone) VALUES ('Lapidadora Sergipe', 'Rua Sol,8700-Bairro das Flores', 'Arauã', 'SE', '23165498700', '','(79) 2233-4004');
INSERT INTO tbl_Cliente(nome, endereco, cidade, uf, cnpj, tipo_organizacao, telefone) VALUES ('Distribuidora São João', 'Rua Airton Senna, 6500-Bairro Limeira', 'São Paulo', 'SP', '22558899000157', '','(11) 2211-4003');
INSERT INTO tbl_Cliente(nome, endereco, cidade, uf, cnpj, tipo_organizacao, telefone) VALUES ('Auto Peças Kabum', 'Rua Joaquim Nabuco, 37-Bairro Ferraz Alvim', 'Salvador', 'BA', '11447788000158', '','(11) 7744-3002');
INSERT INTO tbl_Cliente(nome, endereco, cidade, uf, cnpj, tipo_organizacao, telefone) VALUES ('BIG Cell', 'Rua Netuno, 66-Bairro Limpão', 'Petrópolis', 'RJ', '11223344000159', '','(21) 6699-3001');

	-- Inserir CTRC

	-- DELETE tbl_CTRC WHERE IdCtrcManifesto>'0'
	-- SELECT * FROM tbl_CTRC
	-- Formatando Moedas: FORMAT (column, 'c', 'pt-br') AS nome
	-- Formatando Datas: FORMAT (dtEmissao,'d', 'pt-br') AS dtEmissao
	
INSERT INTO tbl_CTRC (IdClienteReme, IdClienteDest, IdMotorista, dtEmissao, qtPesoFrete, vlFrete) VALUES (1, 2, 1, '2019-06-11', '5000', '3750');
INSERT INTO tbl_CTRC (IdClienteReme, IdClienteDest, IdMotorista, dtEmissao, qtPesoFrete, vlFrete) VALUES (2, 3, 2, '2019-01-11', '3950','12750');
INSERT INTO tbl_CTRC (IdClienteReme, IdClienteDest, IdMotorista, dtEmissao, qtPesoFrete, vlFrete) VALUES (3, 4, 3, '2019-12-13', '3000', '5300');
INSERT INTO tbl_CTRC (IdClienteReme, IdClienteDest, IdMotorista, dtEmissao, qtPesoFrete, vlFrete) VALUES (4, 5, 4, '2019-03-11', '9750', '28900');
INSERT INTO tbl_CTRC (IdClienteReme, IdClienteDest, IdMotorista, dtEmissao, qtPesoFrete, vlFrete) VALUES (5, 1, 5, '2019-07-01', '900', '9310');

	-- Inserir CTRCManifesto

	-- DELETE tbl_CTRCManifesto WHERE IdCtrcManifesto>'0'
	-- SELECT * FROM tbl_CTRCManifesto

INSERT INTO tbl_CTRCManifesto (IdManifesto, IdCtrc) VALUES (1, 1);
INSERT INTO tbl_CTRCManifesto (IdManifesto, IdCtrc) VALUES (2, 2);
INSERT INTO tbl_CTRCManifesto (IdManifesto, IdCtrc) VALUES (3, 3);
INSERT INTO tbl_CTRCManifesto (IdManifesto, IdCtrc) VALUES (4, 4);
INSERT INTO tbl_CTRCManifesto (IdManifesto, IdCtrc) VALUES (5, 5);
