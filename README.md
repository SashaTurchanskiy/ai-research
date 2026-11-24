Build a production-ready RAG (Retrieval-Augmented Generation) application with Spring AI, Spring Boot 4, 
PostgreSQL pgvector and OpenAI. 
In this full course we build an AI Research Assistant where users upload PDFs and chat with them — every answer comes only from their own documents, with page-level citations.

Tech stack

Language & Framework: Java 21, Spring Boot 4, Spring AI 2
AI Models: OpenAI GPT-4o-mini, text-embedding-3-small
Database: PostgreSQL + pgvector
Storage: Backblaze B2 (S3 API)
Document & Token Processing: Apache PDFBox, JTokkit
Security: Spring Security, JWT, Bucket4j
Infra: Docker

Foundation & Security
✅ Spring Boot 4 + Java 21 project setup with Docker & pgvector
✅ Spring Security, JWT authentication & rate limiting (Bucket4j)
✅ Multi-tenant workspaces, so one user's data never reaches another

Documents & Storage
✅ PDF upload to Backblaze B2 (S3 API) with presigned URLs
✅ PDF text extraction with Apache PDFBox
✅ Token counting with JTokkit and chunking with Spring AI TokenTextSplitter

Embeddings & Vector Search
✅ What embeddings are and how vector similarity works
✅ OpenAI embeddings + PostgreSQL pgvector (HNSW, cosine distance)
✅ Async document ingestion pipeline (extract → chunk → embed)
✅ Semantic search with metadata filters

Chat & Grounded Answers
✅ Chats, document attachments & conversation history
✅ Context assembly within a token budget
✅ Spring AI ChatClient with citations [1] [2] and page numbers
✅ Preventing hallucinations: no evidence → no model call
